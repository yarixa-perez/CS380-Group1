package cs380group1.sandwich_shop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class WelcomeScreenController extends ControllerInterface {

    @FXML
    private Button StartButton;

    @FXML
    void Start(ActionEvent event) {
        app.setScene("SignInScreen.fxml");
    }
}
