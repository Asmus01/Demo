module home.com.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens home.com.demo to javafx.fxml;
    exports home.com.demo;
}