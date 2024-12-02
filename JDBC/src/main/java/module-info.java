module demo.jdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.oracle.database.jdbc;


    opens demo.jdbc to javafx.fxml;
    exports demo.jdbc;
}