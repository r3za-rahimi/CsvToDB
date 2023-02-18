package Repository;

import model.Person;

import java.sql.SQLException;

public interface Repository {


    public void add(Person p) throws SQLException;
}
