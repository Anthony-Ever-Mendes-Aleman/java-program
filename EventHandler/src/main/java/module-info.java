module demo.eventhandler {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens demo.eventhandler to javafx.fxml;
    exports demo.eventhandler;
}