import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.text.*;

public class ComplicatedGUI1 extends Application
{
   private Scene scene;

   private VBox mainPane;
   
   private FlowPane headerPane;
 
   private HBox middlePane;
   
   private TitledPane titleTextPane;
   private TitledPane titleChangePane;
   private TitledPane titlePersonPane;
   
   private VBox textPane;
   private VBox changePane;
   private GridPane personPane;
    
   private FlowPane footerPane;
   
   private Label headerLabel;
   
   private Label textLabel1;
   private Label textLabel2;
   
   private CheckBox boldCheckBox;
   private CheckBox italicCheckBox;
   
   private RadioButton redRadioButton;
   private RadioButton greenRadioButton;
   private RadioButton blueRadioButton;
   private RadioButton normalRadioButton;
   private ToggleGroup colorGroup;
   
   private Label nameLabel;
   private Label phoneLabel;
   private Label ageLabel;
   
   private TextField nameField;
   private TextField phoneField;
   private TextField ageField;
   
   private Button exitButton;
   private Button showButton;
   
   public void start(Stage window)
   {
      window.setTitle("A Complicated Window 1");
           
      headerLabel = new Label("This is text in a label");
      Font headerFont = new Font(20);
      headerLabel.setFont(headerFont);
      
      headerPane = new FlowPane();
      headerPane.setAlignment(Pos.BASELINE_CENTER);
      headerPane.getChildren().add(headerLabel);
          
      textLabel1 = new Label("Change the style of: ");
      textLabel2 = new Label("Some text");
      Font someTextFont = new Font("Courier New", 14);
      textLabel2.setFont(someTextFont);
      boldCheckBox = new CheckBox("Bold");
      italicCheckBox = new CheckBox("Italic");
      
      textPane = new VBox(5);
      textPane.getChildren().addAll(textLabel1, textLabel2, boldCheckBox, italicCheckBox);
    
      colorGroup = new ToggleGroup();
 
      redRadioButton = new RadioButton("Red");
      greenRadioButton = new RadioButton("Green");
      blueRadioButton = new RadioButton("Blue");
      normalRadioButton = new RadioButton("Normal background");
      blueRadioButton.setSelected(true);
      
      redRadioButton.setToggleGroup(colorGroup);
      greenRadioButton.setToggleGroup(colorGroup);
      blueRadioButton.setToggleGroup(colorGroup);
      normalRadioButton.setToggleGroup(colorGroup);

      changePane = new VBox(6);
      changePane.getChildren().addAll(redRadioButton, greenRadioButton, blueRadioButton, normalRadioButton);
      
      nameLabel = new Label("Name");
      nameField = new TextField();
      phoneLabel = new Label("Phone");
      phoneField = new TextField();
      ageLabel = new Label("Age");
      ageField = new TextField();
     
      personPane = new GridPane();
      personPane.setVgap(5);
      personPane.setHgap(5);
      personPane.addRow(0, nameLabel, nameField);
      personPane.addRow(1, phoneLabel, phoneField);
      personPane.addRow(2, ageLabel, ageField);
  
      titleTextPane = new TitledPane("Text format", textPane);
      titleTextPane.setCollapsible(false);
      titleTextPane.setPrefSize(220, 132);

      titleChangePane = new TitledPane("Change background", changePane);
      titleChangePane.setCollapsible(false);
      titleChangePane.setPrefSize(220, 132);
      
      titlePersonPane = new TitledPane("Person data", personPane);
      titlePersonPane.setCollapsible(false);
      titlePersonPane.setPrefSize(220, 132);
   
      middlePane = new HBox(5);
      middlePane.getChildren().addAll(titleTextPane, titleChangePane, titlePersonPane);

      exitButton = new Button("Exit");
      showButton = new Button("Show result");
      
      footerPane = new FlowPane();
      footerPane.setAlignment(Pos.BASELINE_RIGHT);
      footerPane.setPadding(new Insets(0,5,0,0));
      footerPane.setHgap(5);
      footerPane.getChildren().add(exitButton);
      footerPane.getChildren().add(showButton);
      
      mainPane = new VBox(5);
      mainPane.setPadding(new Insets(0,5,0,5));
      mainPane.setBackground(new Background(new BackgroundFill(Color.rgb(180, 210, 255), CornerRadii.EMPTY, Insets.EMPTY)));
      mainPane.getChildren().addAll(headerPane, middlePane, footerPane);
      
      scene = new Scene(mainPane, 670, 204);

      window.setScene(scene);
      window.setResizable(false);
      window.show();
    }
 }
