package U9_T1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductoModel {

    public static void insertProducto (Producto producto) throws SQLException {

        Connection con=ConexionBD.getConnection();

        String sql="INSERT INTO products VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setString(1,producto.getProductCode());
        sentencia.setString(2,producto.getName());
        sentencia.setString(3,producto.getProductLine());
        sentencia.setString(4,producto.getScale());
        sentencia.setString(5,producto.getVendor());
        sentencia.setString(6,producto.getDescrip());
        sentencia.setInt(7,producto.getQuanty());
        sentencia.setDouble(8,producto.getPrice());
        sentencia.setDouble(9,producto.getMsr());

        sentencia.executeUpdate();
    }


}
