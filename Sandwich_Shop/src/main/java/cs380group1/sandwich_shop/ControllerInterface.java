package cs380group1.sandwich_shop;

import javafx.application.Application;

public abstract class ControllerInterface {
    protected StoreManager app;

    public void setApp(StoreManager app) {
        this.app = app;
    }
}
