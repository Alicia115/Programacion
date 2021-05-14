package U9_T1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaModel {

    public static void insertCategoria (Categoria categoria) throws SQLException {

        Connection con=ConexionBD.getConnection();

        String sql="INSERT INTO productlines VALUES (?,'','','')";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setString(1,categoria.getProductline());

        sentencia.executeUpdate();
    }

}
