package cs380group1.sandwich_shop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class EmployeeMenuController extends ControllerInterface{

    @FXML
    private Button BeginOrderButton;
    private Button ClockInButton;
    private Button ClockOutButton;
    private Button EmployeeInformationButton;

    

    @FXML
    void BeginOrder(ActionEvent event) {

    }

    @FXML
    void ClockIn(ActionEvent event) {
        app.getCurrentEmployee().clockIn();
        ClockOutButton.setDisable(false);
        ClockInButton.setDisable(true);
    }

    @FXML
    void ClockOut(ActionEvent event) {
        app.getCurrentEmployee().clockOut();
        ClockOutButton.setDisable(true);
        ClockInButton.setDisable(false);
    }

    @FXML
    void EmployeeInformation(ActionEvent event) {
        loadScene("ViewEmployeeInfoTable.fxml", event);
    }

    private void loadScene(String fxmlFile, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
