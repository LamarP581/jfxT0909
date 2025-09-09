module com.example.jfxtues0909 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;

    opens com.example.jfxtues0909 to javafx.fxml;
    exports com.example.jfxtues0909;
}