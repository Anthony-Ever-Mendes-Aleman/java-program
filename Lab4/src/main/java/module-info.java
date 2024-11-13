module demo.lab4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo.lab4 to javafx.fxml;
    exports demo.lab4;
}