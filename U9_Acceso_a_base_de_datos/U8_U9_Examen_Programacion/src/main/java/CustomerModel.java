import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerModel {

    public static void insertarCustomer (Customer customer) throws SQLException{

        Connection con = ConexionBD.getConnection();

        String consulta = "INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = con.prepareStatement(consulta);

        statement.setInt(1, customer.getCustomerNumber());
        statement.setString(2, customer.getCustomerName());
        statement.setString(3, customer.getCustomerLastName());
        statement.setString(4, customer.getCustomerFirstName());
        statement.setString(5, customer.getPhone());
        statement.setString(6, customer.getAddres1());
        statement.setString(7, customer.getAdress2());
        statement.setString(8, customer.getCity());
        statement.setString(9, customer.getState());
        statement.setString(10, customer.getPostalCode());
        statement.setString(11, customer.getCountry());
        statement.setInt(12, customer.getEmployeeNumber());
        statement.setDouble(13, customer.getCredit());

        statement.executeUpdate();

    }

}
