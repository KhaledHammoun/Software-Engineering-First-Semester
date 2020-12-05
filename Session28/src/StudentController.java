import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Popup;
import javafx.stage.PopupWindow;

public class StudentController
{
  @FXML private Tab allStudentsTab;
  @FXML private Tab changeCountryTab;

  @FXML private TextArea allStudentsArea;
  @FXML private Button getButton;

  @FXML private TextField firstNameField;
  @FXML private TextField lastNameField;
  @FXML private TextField countryField;
  @FXML private ComboBox<Student> studentBox;
  @FXML private Button updateButton;

  @FXML private MenuItem exitMenuItem;
  @FXML private CheckMenuItem editFieldsMenuItem;
  @FXML private CheckMenuItem editAreaMenuItem;
  @FXML private MenuItem aboutMenuItem;

  private StudentFileAdapter adapter;

  /*If the controller class has a method with the signature: public void initialize(),
    that method will automatically be called before the GUI starts up. So having
    that method is useful for initializing fields, loading data in ComboBoxes, etc.
  */
  public void initialize()
  {
    adapter = new StudentFileAdapter("students.bin");
    updateStudentArea();
    updateStudentBox();
  }

  private void updateStudentBox()
  {
    int currentIndex = studentBox.getSelectionModel().getSelectedIndex();
    studentBox.getItems().clear();

    StudentList students = adapter.getAllStudents();
    for (int i = 0; i < students.size(); i++)

    {
      studentBox.getItems().add(students.get(i));
    }

    if (currentIndex == -1 && studentBox.getItems().size() > 0)
    {
      studentBox.getSelectionModel().select(0);
    }
    else
    {
      studentBox.getSelectionModel().select(currentIndex);
    }
  }

  private void updateStudentArea()
  {
    //The tabChanged method might be automatically called before the initialize method,
    //as the GUI is loaded. I.e. adapter could be null, and cause a NullPointerException
    if (adapter != null)
    {
      StudentList students = adapter.getAllStudents();
      allStudentsArea.setText(students.toString());
    }
  }

  //In SceneBuilder, every control that can cause an ActionEvent, can be set to
  // call a method when the event occurs.
  public void handleActions(ActionEvent e)
  {
    //Check which control caused the ActionEvent to occur
    if (e.getSource() == getButton)
    {
      updateStudentArea();
    }
    else if (e.getSource() == updateButton)
    {
      String firstName = firstNameField.getText();
      String lastName = lastNameField.getText();
      String country = countryField.getText();

      if (country.equals(""))
      {
        country = "?";
      }

      adapter.changeCountry(firstName, lastName, country);
      updateStudentBox();
      countryField.setText("");
    }
    else if (e.getSource() == studentBox)
    {
      Student temp = studentBox.getSelectionModel().getSelectedItem();

      if (temp != null)
      {
        firstNameField.setText(temp.getFirstName());
        lastNameField.setText(temp.getLastName());
        countryField.setPromptText(temp.getCountry());
      }
    }
    else if (e.getSource() == exitMenuItem)
    {
      Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
          "Do you really want to exit the program?", ButtonType.YES,
          ButtonType.NO);
      alert.setTitle("Exit");
      alert.setHeaderText(null);

      alert.showAndWait();

      if (alert.getResult() == ButtonType.YES)
      {
        System.exit(0);
      }
    }
    else if (e.getSource() == editAreaMenuItem)
    {
      if (editAreaMenuItem.isSelected())
      {
        allStudentsArea.setEditable(true);
      }
      else
      {
        allStudentsArea.setEditable(false);
      }
    }
    else if (e.getSource() == editFieldsMenuItem)
    {
      if (editFieldsMenuItem.isSelected())
      {
        firstNameField.setEditable(true);
        lastNameField.setEditable(true);
      }
      else
      {
        firstNameField.setEditable(false);
        lastNameField.setEditable(false);
      }
    }
    else if (e.getSource() == aboutMenuItem)
    {
      Button newButton = new Button();
      ContextMenu test = new ContextMenu();

      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setHeaderText(null);
      alert.setTitle("About");
      alert.setContentText(
          "This is just a little program that demonstrates some of the GUI features in Java");
      alert.showAndWait();
    }
  }

  //In SceneBuilder, a Tab can be set to call a method when it's selected and deselected.
  //Will also be called when the GUI loads, since one Tab is selected from the start.
  public void tabChanged(Event e)
  {
    //Check which Tab is selected, and update the appropriate control
    if (allStudentsTab.isSelected())
    {
      updateStudentArea();
    }
    else if (changeCountryTab.isSelected())
    {
      updateStudentBox();
    }
  }
}
