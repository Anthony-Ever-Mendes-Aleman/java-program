package demo.jdbc;

import java.sql.*;
import java.sql.Connection;

public class JDBC {
    private static final String URL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD"; // Update with the correct details
    private static final String USER = "COMP228_F24_soh_34";
    private static final String PASSWORD = "Chico810";

    // Method to get a database connection
    public static Connection getConnection() throws SQLException {
        try {
            // Load the Oracle JDBC driver class explicitly (optional for newer drivers)
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Oracle JDBC Driver Loaded Successfully.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Oracle JDBC Driver not found.", e);
        }

        // Attempt to establish a connection
        try {
            System.out.println("Establishing database connection...");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully.");
            return connection;
        } catch (SQLException e) {
            System.err.println("Failed to establish a connection to the database.");
            throw e;
        }
    }

    // Method to close connection
    public static void closeConnection(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection Closed");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions
        }
    }
    public static void main(String[] args) {

        try {
            System.out.println("Driver Loading...");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Driver Loaded");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("Connecting to Database");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@199.212.26.208:SQLD", "COMP228_F24_soh_34", "password");
            System.out.println("Connected to Database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
