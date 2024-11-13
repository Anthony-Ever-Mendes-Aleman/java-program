module demo.controllercommunication {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo.controllercommunication to javafx.fxml;
    exports demo.controllercommunication;
}