module com.example.martialart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.martialart to javafx.fxml;
    exports com.example.martialart;
}