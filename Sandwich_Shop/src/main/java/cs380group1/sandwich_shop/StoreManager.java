package cs380group1.sandwich_shop;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * This is the main application class of this project.
 * There will be a driver class that will call this class to begin execution.
 */
public class StoreManager extends Application {

    // Fields
    private String storeManager;
    private int storeNumber;

    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
    }

    /**
     * Constructor for StoreManager object
     * @param storeManager The name of the store manager
     * @param storeNumber The number of the store
     */
    public StoreManager(String storeManager, int storeNumber) {
        this.storeManager = storeManager;
        this.storeNumber = storeNumber;
    }

    /**
     * Setter method for store manager
     * @param storeManager The manager of a particular store
     */
    public void setStoreManager(String storeManager) {
        this.storeManager = storeManager;
    }

    /**
     * Getter method for store manager
     * @return The name of the store manager
     */
    public String getStoreManager() {
        return storeManager;
    }

    /**
     * Setter method for store number
     * @param storeNumber The number of a particular store
     */
    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    /**
     * Getter method for store number
     * @return The number of the store
     */
    public int getStoreNumber() {
        return storeNumber;
    }
}
