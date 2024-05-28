module cs380group1.sandwich_shop {
    requires javafx.controls;
    requires javafx.fxml;


    opens cs380group1.sandwich_shop to javafx.fxml;
    exports cs380group1.sandwich_shop;
}