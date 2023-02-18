package Repository;

import model.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonRepo implements Repository{


    Connection connection;
    PreparedStatement statement;


    public PersonRepo() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst" ,"root" , "1234");
    }

    @Override
    public void add(Person p) throws SQLException {

        statement =connection.prepareStatement("insert into costumer(id,name,creditScore,geography,gender,age,tenure,balance,numOfProducts,hasCrCard,isActiveMember,estimatedSalary,exited,currentLoanAmount) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

        statement.setLong(1,p.getCustomerId());
        statement.setString(2,p.getSurName());
        statement.setLong(3,p.getCreditScore());
        statement.setString(4,p.getGeography());
        statement.setString(5,p.getGender());
        statement.setInt(6,p.getAge());
        statement.setInt(7,p.getTenure());
        statement.setFloat(8,p.getBalance());
        statement.setInt(9,p.getNumOfProducts());
        statement.setBoolean(10,p.isHasCrCard());
        statement.setBoolean(11,p.isActiveMember());
        statement.setFloat(12,p.getEstimatedSalary());
        statement.setBoolean(13,p.isExited());
        statement.setLong(14,p.getCreditScore());




    }
}
