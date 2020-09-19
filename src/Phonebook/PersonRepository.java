package Phonebook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private Connection connect;

    public PersonRepository(Connection connection) {
        this.connect = connection;
    }

    public List<Person> GetPeople() {
        try (
             Statement statement = connect.createStatement();
             ResultSet results = statement.executeQuery("SELECT * From " + TableNames.TABLE_PEOPLE);
            ){
            List<Person> People = new ArrayList<>();

            while (results.next()) {
                Person person = new Person();
                person.setId(results.getInt(TableNames.COLUMN_PEOPLE_ID));
                person.setName(results.getString(TableNames.COLUMN_PEOPLE_NAME));
                person.setFamily(results.getString(TableNames.COLUMN_PEOPLE_FAMILY));
                People.add(person);
            }
            return People;

        } catch (SQLException e) {
            System.out.println("Error in Execute Query " + e.getMessage());
            return null;
        }
    }

    public List<Person> getfirst(int id){
        Statement state = null;
        ResultSet res   = null;

        try {
            state = connect.createStatement();
            res = state.executeQuery("select * from "+TableNames.TABLE_PEOPLE+" where Id = "+id);
            ArrayList<Person> arr = new ArrayList<>();

            while (res.next()){
                Person data = new Person();
                data.setId(res.getInt(TableNames.COLUMN_PEOPLE_ID));
                data.setName(res.getString(TableNames.COLUMN_PEOPLE_NAME));
                data.setFamily(res.getString(TableNames.COLUMN_PEOPLE_FAMILY));
                arr.add(data);
            }
            return arr;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
        finally {
            try {
                if (res != null) {
                    res.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (state != null) {
                    state.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void join(int id){
        TableNames.id= id;
        try(Statement state = connect.createStatement();
            ResultSet res = state.executeQuery
                    ("select * from "+TableNames.TABLE_PEOPLE+" where id ="+TableNames.id+";"))

                    /*("select "+TableNames.COLUMN_NUMBERS_NUMBER+
            " from "+TableNames.TABLE_NUMBERS+" where Numbers.PersonId = (select id from People where Name like '"+name+"')");
                    )*/
        {
            while (res.next()){
                System.out.println("the name is "+res.getString(TableNames.COLUMN_PEOPLE_NAME));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
