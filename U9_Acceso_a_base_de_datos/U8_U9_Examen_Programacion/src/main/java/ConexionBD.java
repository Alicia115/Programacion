import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static Connection con = null;

    public static Connection getConnection(){

        try {
            con = DriverManager.getConnection("jdbc:mariadb://localhost:3336/classicmodels?user=root&password=root"
                    + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");

            System.out.println("Conexion Establecida");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return (con);
    }

    public  static  void close(){

        try {
            if(con!=null){
                con.close();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


}
