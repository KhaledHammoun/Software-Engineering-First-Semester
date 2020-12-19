import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentFileAdapterGUIFXML extends Application
{
  public void start(Stage window) throws IOException
  {
    window.setTitle("Student File Adapter GUI FXML");
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("StudentFileAdapterGUI.fxml"));
    Scene scene = new Scene(loader.load());
    window.setScene(scene);
    window.show();
  }
}
