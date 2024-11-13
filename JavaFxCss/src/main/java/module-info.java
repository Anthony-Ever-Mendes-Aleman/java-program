module demo.javafxcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo.javafxcss to javafx.fxml;
    exports demo.javafxcss;
}