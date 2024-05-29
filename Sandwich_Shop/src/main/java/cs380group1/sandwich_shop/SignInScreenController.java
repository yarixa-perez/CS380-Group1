package cs380group1.sandwich_shop;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class SignInScreenController extends ControllerInterface {

    @FXML
    private Button LoginButton;

    @FXML
    private PasswordField PasswordField;

    @FXML
    /**
     * Check to see if an employee exists in the employee map, and if so log in as that employee
     */
    void Login(ActionEvent event) {
        int employeeNumber = Integer.parseInt(PasswordField.getText());
        if(app.getEmployeeManager().doesEmployeeExist(employeeNumber)) {
            app.setCurrentEmployee(app.getEmployeeManager().getEmployee(employeeNumber));
            app.setScene("EmployeeMenu.fxml");
        }
    }

    @FXML
    void HandleKeyPress(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER) {
            Login(new ActionEvent());
        }
    }

}
