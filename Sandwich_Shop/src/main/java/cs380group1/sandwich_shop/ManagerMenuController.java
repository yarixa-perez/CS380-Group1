package cs380group1.sandwich_shop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ManagerMenuController {

    @FXML
    private Button EmployeeMenuButton;
    @FXML
    private Button ViewDailyReportButton;
    @FXML
    private Button ViewEmployeeInfoButton;
    @FXML
    private Button ViewStockButton;
    @FXML
    private Button ViewTodaysOrdersButton;

    @FXML
    void GoToEmployeeMenu(ActionEvent event) {
        loadScene("EmployeeMenu.fxml", event);
    }

    @FXML
    void ViewDailyReport(ActionEvent event) {
        loadScene("", event);
    }

    @FXML
    void ViewEmployeeInfo(ActionEvent event) {
        loadScene("ViewEmployeeInfoTable.fxml", event);
    }

    @FXML
    void ViewStock(ActionEvent event) {
        loadScene("ViewStock.fxml", event);
    }

    @FXML
    void ViewTodaysOrders(ActionEvent event) {
        loadScene("ViewOrders.fxml", event);
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
