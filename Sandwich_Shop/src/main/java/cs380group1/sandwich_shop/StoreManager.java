package cs380group1.sandwich_shop;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.time.LocalDate;

/**
 * This is the main application class of this project.
 * There will be a driver class that will call this class to begin execution.
 */
public class StoreManager extends Application {

    // Fields
    private EmployeeManager employeeManager = new EmployeeManager();
    private OrderManager orderManager = new OrderManager();
    private String storeManager;
    private int storeNumber;
    private Stage stage;
    private Scene scene;
    private Employee currentEmployee;

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) throws Exception {
        //testing:
        employeeManager.addEmployee(new Employee("Eli", "Holter", LocalDate.of(2002, 1, 24), 1, "Sandwich Artist", 40000.00F));
        employeeManager.getEmployee(1).clockIn();
        //end testing

        this.stage = stage;
        stage.setTitle("Sandwich Shop");

        try {
            setScene("WelcomeScreen.fxml");
        }

        catch (Exception e) {
            System.out.println("Unable to load primary scene from FXMLLoader! with exception" + e.getMessage());
        }

    }

    public void setScene(String sceneFN) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneFN));
            stage.setScene(new Scene(loader.load(), 800, 600));
            stage.show();

            ControllerInterface controller = loader.getController();
            controller.setApp(this);
        }

        catch (Exception e) {
            System.out.println("Unable to load Scene " + sceneFN + " with exception: " + e.getMessage());
        }
    }

    public void setCurrentEmployee(Employee employee) {
        this.currentEmployee = employee;
    }

    public Employee getCurrentEmployee() {
        return this.currentEmployee;
    }

    public EmployeeManager getEmployeeManager() {
        return employeeManager;
    }

    public void setEmployeeManager(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    public OrderManager getOrderManager() {
        return orderManager;
    }

    public void setOrderManager(OrderManager orderManager) {
        this.orderManager = orderManager;
    }
}
