package cs380group1.sandwich_shop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class WelcomeScreenController {

    @FXML
    private Button StartButton;

    @FXML
    void Start(ActionEvent event) {
        loadScene("SignInScreen.fxml", event);
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
