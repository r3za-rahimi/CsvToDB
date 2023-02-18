package Repository;

import model.Person;

import java.sql.*;

public class PersonRepo implements Repository {


    Connection connection;
    PreparedStatement statement;


    public PersonRepo()  {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst", "root", "1234");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(Person p) {

        try {
            statement = connection.prepareStatement("insert into costumer(id,name,creditScore,geography,gender,age,tenure,balance,numOfProducts,hasCrCard,isActiveMember,estimatedSalary,exited,currentLoanAmount) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            statement.setLong(1, p.getCustomerId());
            statement.setString(2, p.getSurName());
            statement.setLong(3, p.getCreditScore());
            statement.setString(4, p.getGeography());
            statement.setString(5, p.getGender());
            statement.setInt(6, p.getAge());
            statement.setInt(7, p.getTenure());
            statement.setFloat(8, p.getBalance());
            statement.setInt(9, p.getNumOfProducts());
            statement.setBoolean(10, p.isHasCrCard());
            statement.setBoolean(11, p.isActiveMember());
            statement.setFloat(12, p.getEstimatedSalary());
            statement.setBoolean(13, p.isExited());
            statement.setLong(14, p.getCurrentLoanAmount());


            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public boolean findById(long id) {

        try {
            statement = connection.prepareStatement("select id from costumer where id=?");

            statement.setLong(1,id);

           ResultSet r = statement.executeQuery();
           if (r.next()){
               return false;
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
