package Project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Func {
    private Connection connect;

    public Func(Connection con) {
        this.connect = con;
    }

    public String getuser(int x) {
        try (Statement state = connect.createStatement();
             ResultSet res = state.executeQuery("select * from user where id = " + x)) {

            while (res.next()) {
                return ("the name is " + res.getString("name")+" and age is "+res.getInt("age"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<User> getage() {
        try (Statement state = connect.createStatement();
             ResultSet res = state.executeQuery("select age from user")) {
             List<User> arr = new ArrayList<>();

            while (res.next()) {
                User user = new User();
                user.setAge(res.getInt("age"));
                arr.add(user);
            }
            return arr;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void setuser(){
        try {
            Statement state = connect.createStatement();
            state.executeUpdate("update user set age = 23 where id = 2");
            System.out.println("final update");
            state.close();

        }catch (SQLException e){
            System.out.println("ok"+e.getMessage());
        }
    }

    public void join(){
        try( Statement state = connect.createStatement();
             ResultSet res = state.executeQuery("select user.name,address.city from user join address on\n" +
                     "user.id = address.id;")) {
            while (res.next()){
                System.out.println("the name is "+res.getString("name") + " and city is "+res.getString("city"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
