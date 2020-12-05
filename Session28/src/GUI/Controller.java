package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {

  @FXML
  private MenuItem exitMenuItem;

  @FXML
  private ToggleGroup projects;

  @FXML
  private MenuItem aboutMenuItem;

  @FXML
  private Tab projectsTab;

  @FXML
  private TextArea projectsTextArea;

  @FXML
  private TextField projectNameTextField;

  @FXML
  private TextField projectStatusTextField;

  @FXML
  private Button addProjectButton;

  @FXML
  private Button editProjectButton;

  @FXML
  private ComboBox<?> availableEmployeeComboBox;

  @FXML
  private Button assignEmployeeButton;

  @FXML
  private Button removeEmployeeButton;

  @FXML
  private Button saveProjectButton;

  @FXML
  private TextArea teamMembersTextArea;

  @FXML
  private Tab requirementsTab;

  @FXML
  private TextArea requirementsTextArea;

  @FXML
  private TextField projectSelectedTextField;

  @FXML
  private TextField requirementIDTextField;

  @FXML
  private ComboBox<?> requirementStatusComboBox;

  @FXML
  private ComboBox<?> requirementTypeComboBox;

  @FXML
  private TextField requirementDescriptionTextField;

  @FXML
  private TextField estimateHoursTextField;

  @FXML
  private TextField priorityNumberTextField;

  @FXML
  private TextField deadlineTextField;

  @FXML
  private ComboBox<?> responsibleTeamMemberComboBox;

  @FXML
  private Button addRequirementButton;

  @FXML
  private Button editRequirementButton;

  @FXML
  private Button saveRequirementButton;

  @FXML
  private Tab tasksTab;

  @FXML
  private TextArea tasksTextArea;

  @FXML
  private TextField projectSelectedOnTasksTextField;

  @FXML
  private TextField requirementSelectedTextField;

  @FXML
  private TextField taskIDTextField;

  @FXML
  private ComboBox<?> taskStatusComboBox;

  @FXML
  private TextField taskDescriptionTextArea;

  @FXML
  private TextField taskEstimateTextField;

  @FXML
  private TextField taskTimeUsedTextField;

  @FXML
  private TextField taskDeadline;

  @FXML
  private ComboBox<?> taskTeamMembersComboBox;

  @FXML
  private Button addTaskButton;

  @FXML
  private Button editTaskButton;

  @FXML
  private Button saveTaskButton;

  @FXML
  private Tab employeesTab;

  @FXML
  private TextArea employeeTextArea;

  @FXML
  private TextField employeeIDTextField;

  @FXML
  private TextField employeeFirstName;

  @FXML
  private TextField employeeLastName;

  @FXML
  private ComboBox<?> employeeRoleComboBox;

  @FXML
  private TextArea employeeTaskTextArea;

  @FXML
  private Button addEmployeeButton;

  @FXML
  private Button editEmployeeButton;

  @FXML
  private Button saveEmployeeButton;

}
