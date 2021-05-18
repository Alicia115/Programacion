import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PaymentModel {

    public static void insertarPayment (Payment payment) throws SQLException {

        Connection con = ConexionBD.getConnection();

        String consulta = "INSERT INTO payments VALUES (?,?,?,?)";

        PreparedStatement statement = con.prepareStatement(consulta);

        statement.setInt(1, payment.getCustomerNumber());
        statement.setString(2, payment.getCheckNumber());
        statement.setString(3, payment.getDate());
        statement.setDouble(4, payment.getAmount());

        statement.executeUpdate();

    }
}
