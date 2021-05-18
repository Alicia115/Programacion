import java.sql.Connection;
import java.sql.SQLException;

public class Transacciones {

    public static void main(String[] args) {

        Connection con = ConexionBD.getConnection();

        try {

            con.setAutoCommit(false);

            CustomerModel.insertarCustomer(
                    new Customer(
                            789,
                            "Alicia",
                            "Acosta",
                            "Ternero",
                            "954656789",
                            "calle mia",
                            "calle tuya",
                            "sevilla",
                            "state 1",
                            "43567",
                            "España",
                            1056,
                            23.98
                    )
            );

            System.out.println("Cliente insertado");

            PaymentModel.insertarPayment(
                    new Payment(
                            789,
                            "numero cher",
                            "2014/12/12",
                            65.87
                    )
            );

            System.out.println("Pago insertado");

            PaymentModel.insertarPayment(
                    new Payment(
                            789,
                            "chekeo",
                            "2015/01/01",
                            85.87
                    )
            );

            System.out.println("Pago insertado");

            con.commit();

        } catch (SQLException throwables) {
            throwables.printStackTrace();

            try {
                if(con!=null){
                    con.rollback();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


}
