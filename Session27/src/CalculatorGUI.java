import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorGUI extends Application
{
  private Scene scene;
  private VBox mainPane;
  private FlowPane resultPane;
  private TextField result;
  private GridPane inputPane;
  private Button zeroButton;
  private Button oneButton;
  private Button twoButton;
  private Button threeButton;
  private Button fourButton;
  private Button fiveButton;
  private Button sixButton;
  private Button sevenButton;
  private Button eightButton;
  private Button nineButton;
  private Button divisionButton;
  private Button multiplicationButton;
  private Button subtractionButton;
  private Button additionButton;
  private Button equalsButton;
  private Button floatPointButton;

  public void start(Stage window)
  {
    window.setTitle("Calculator");

    resultPane = new FlowPane();
    result = new TextField();
    result.setEditable(false);
    result.setPrefWidth(207);
    result.setStyle("-fx-border-color: blue");
    resultPane.getChildren().add(result);



    zeroButton = new Button("0");
    oneButton = new Button("1");
    twoButton = new Button("2");
    threeButton = new Button("3");
    fourButton = new Button("4");
    fiveButton = new Button("5");
    sixButton = new Button("6");
    sevenButton = new Button("7");
    eightButton = new Button("8");
    nineButton = new Button("9");
    divisionButton = new Button("/");
    multiplicationButton = new Button("*");
    subtractionButton = new Button("-");
    additionButton = new Button("+");
    equalsButton = new Button("=");
    floatPointButton = new Button(".");

    inputPane = new GridPane();
    inputPane.setHgap(2.5);
    inputPane.setVgap(2.5);
    inputPane.addColumn(0, sevenButton, fourButton, oneButton, zeroButton);
    inputPane.addColumn(1, eightButton, fiveButton, twoButton, floatPointButton);
    inputPane.addColumn(2, nineButton,sixButton,threeButton, equalsButton);
    inputPane.addColumn(3, divisionButton, multiplicationButton, subtractionButton, additionButton);

    for (int i = 0; i < inputPane.getChildren().size(); i++)
    {
      ((Button)inputPane.getChildren().get(i)).setPrefSize(50,50);
    }
    mainPane = new VBox();
    mainPane.getChildren().addAll(resultPane, inputPane);

    scene = new Scene(mainPane, 207,200);
    window.setScene(scene);
    window.setResizable(false);
    window.show();
  }

  private class MyListener implements EventHandler<ActionEvent>
  {
    Calculator calculator = new Calculator();

    public void handle (ActionEvent e)
    {
      //String[] toCalc = result.getText().split(new String[]{"*", "/"});

      if(e.getSource()==additionButton)
      {
        //calculator.addition();
      }
    }
  }
}
