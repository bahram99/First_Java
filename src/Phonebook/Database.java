package Phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static final String DB_NAME = "PhoneBook.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\bahra\\Desktop\\java\\first\\" + DB_NAME;

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public boolean Open() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Error In Open Connection :" + e.getMessage());
            return false;
        }
    }

    public boolean Close() {
        try {
            connection.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error In Close Connection :" + e.getMessage());
            return false;
        }
    }

}
