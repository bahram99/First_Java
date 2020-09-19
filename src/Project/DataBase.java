package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    public static final String Dbname = "Projectone.db";
    public static final String connection_string = "jdbc:sqlite:C:\\Users\\bahra\\Desktop\\java\\first\\" + Dbname;

    public Connection connect;


    public Connection getConnect() {
        return connect;
    }

    public boolean open() {
        try {
            connect = DriverManager.getConnection(connection_string);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean close() {
        try {
            connect.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
