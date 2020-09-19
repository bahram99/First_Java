package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Testconnect {
    public static void main(String[] arg) {
        /*try {
            java.sql.Connection connect = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\bahra\\Desktop\\java\\testdb.db");
            Statement state = connect.createStatement();
            state.execute("create table user (id int , name message_text )");

            state.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        List<String> newlist = new ArrayList<>();
        newlist.add("ali");
        newlist.add("alireza");
        newlist.add("saman");

        Concurrent con = new Concurrent(2,2);
        con.setArr(1);
        System.out.println(Arrays.toString(con.getArr()));

        con.setlisttwo();
        System.out.println(con.getList());
        System.out.println(Collections.frequency(con.list,"b"));

        con.setTree(1111);
        con.setTree(200);
        System.out.println(con.getTree());

        switch (con.compare()) {
            case  1 -> System.out.println("bigger");
            case  0 -> System.out.println("isequal");
            case -1 -> System.out.println("shorter");
        }*/
        int a = 5;
        System.out.println(++a);

        System.out.println(a++);


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println(j);
            }
        }
        Testconnect sh = new Testconnect();
        sh.sho();


    }

    public void sho() {
        System.out.println(this);
    }
}

























