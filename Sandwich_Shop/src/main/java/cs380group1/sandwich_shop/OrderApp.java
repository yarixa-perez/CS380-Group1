package cs380group1.sandwich_shop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrderApp extends Application {
    private Order order;
    private ListView<String> orderListView;
    private Label totalLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
            primaryStage.setTitle("Sandwich Shop");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addItem(String name, String price) {
        try {
            float itemPrice = Float.parseFloat(price);
            Item item = new Item(name, itemPrice);
            order.addItem(item);
            updateOrderList();
        } catch (NumberFormatException e) {
            // Handle invalid price input
            showAlert("Invalid price", "Please enter a valid number for the price.");
        }
    }

    private void removeSelectedItem() {
        int selectedIndex = orderListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            Item item = order.orderList().get(selectedIndex);
            order.removeItem(item);
            updateOrderList();
        }
    }

    private void updateOrderList() {
        orderListView.getItems().clear();
        for (Item item : order.orderList()) {
            orderListView.getItems().add(item.getName() + " - $" + item.getPrice());
        }
        totalLabel.setText("Total: $" + order.getTotal());
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
