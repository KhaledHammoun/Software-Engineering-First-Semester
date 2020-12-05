import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FirstGUI extends Application
{
  private Scene scene;
  private GridPane mainPane;
  private VBox firstPane;
  private VBox secondPane;
  private VBox thirdPane;
  private HBox hBoxXField;
  private HBox hBoxYField;
  private CheckBox checkBoxOK;
  private CheckBox checkBoxCancel;
  private Label labelX;
  private Label labelY;
  private TextField textX;
  private TextField textY;
  private Button buttonOk;
  private Button buttonCancel;
  private Button buttonClear;

  public void start (Stage window)
  {
    window.setTitle("Align");

    checkBoxOK = new CheckBox("Exit on OK");
    checkBoxCancel = new CheckBox("Exit on Cancel");

    firstPane = new VBox(10);
    firstPane.getChildren().addAll(checkBoxOK, checkBoxCancel);
    firstPane.setAlignment(Pos.CENTER_LEFT);
    labelX = new Label("X:");
    labelY = new Label("Y:");
    textX = new TextField();
    textX.setPrefSize(80, 10);
    textY = new TextField();
    textY.setPrefSize(80, 10);

    hBoxXField = new HBox(10);
    hBoxYField = new HBox(10);
    hBoxXField.getChildren().addAll(labelX, textX);
    hBoxYField.getChildren().addAll(labelY, textY);

    secondPane = new VBox(10);
    secondPane.getChildren().addAll(hBoxXField, hBoxYField);
    secondPane.setAlignment(Pos.CENTER_LEFT);
    buttonOk = new Button("OK");
    buttonCancel = new Button("Cancel");
    buttonClear = new Button("Clear");

    buttonOk.setPrefSize(100,10);
    buttonCancel.setPrefSize(100,10);
    buttonClear.setPrefSize(100,10);

    thirdPane = new VBox(5);
    thirdPane.getChildren().addAll(buttonOk, buttonCancel, buttonClear);
    thirdPane.setAlignment(Pos.CENTER_LEFT);
    mainPane = new GridPane();
    mainPane.addColumn(0, firstPane);
    mainPane.addColumn(1, secondPane);
    mainPane.addColumn(2, thirdPane);
    mainPane.setHgap(30);
    mainPane.setPadding(new Insets(10, 10, 0 ,10));

    scene = new Scene(mainPane, 380,100);
    window.setScene(scene);
    window.show();
  }
}
