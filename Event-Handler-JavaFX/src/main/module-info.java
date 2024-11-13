module com.example.eventhandlerjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventhandlerjavafx to javafx.fxml;
    exports com.example.eventhandlerjavafx;
}