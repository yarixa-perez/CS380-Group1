package cs380group1.sandwich_shop;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

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
        // Initialize an Order (sample data for testing)
        Employee cashier = new Employee("CashierName");
        Customer customer = new Customer("CustomerName");
        order = new Order(cashier, customer, 0.9f, 1);

        // Initialize UI elements
        orderListView = new ListView<>();
        totalLabel = new Label("Total: $0.00");

        // Set up layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        // Add item controls
        TextField itemNameField = new TextField();
        itemNameField.setPromptText("Item Name");
        TextField itemPriceField = new TextField();
        itemPriceField.setPromptText("Item Price");
        Button addItemButton = new Button("Add Item");
        addItemButton.setOnAction(e -> addItem(itemNameField.getText(), itemPriceField.getText()));

        HBox addItemBox = new HBox(10, itemNameField, itemPriceField, addItemButton);

        // Remove item controls
        Button removeItemButton = new Button("Remove Selected Item");
        removeItemButton.setOnAction(e -> removeSelectedItem());

        // Add elements to layout
        layout.getChildren().addAll(addItemBox, orderListView, removeItemButton, totalLabel);

        // Set up and show scene
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Order Management");
        primaryStage.show();
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
