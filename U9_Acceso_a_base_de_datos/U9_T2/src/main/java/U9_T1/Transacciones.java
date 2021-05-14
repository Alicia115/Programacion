package U9_T1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static void main(String[] args) {

        Connection con=ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);
            CategoriaModel.insertCategoria(
                    new Categoria("358")
            );

            System.out.println("Insertada categoria");

           ProductoModel.insertProducto(
                    new Producto(
                            "58",
                            "aaa",
                            "358",
                            "54dd",
                            "shshs",
                            "aahs",
                            344,
                            87.09,
                            34.67
                    )
            );

            con.commit();
            System.out.println("Insertado producto");


            String oficina="INSERT INTO offices VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia=con.prepareStatement(oficina);

            sentencia.setString(1,"45");
            sentencia.setString(2,"Sevilla");
            sentencia.setString(3,"45ff");
            sentencia.setString(4,"45fsf");
            sentencia.setString(5,"45vfg");
            sentencia.setString(6,"45gbg");
            sentencia.setString(7,"45nhg");
            sentencia.setString(8,"45sfsf");
            sentencia.setString(9,"45wad");

            sentencia.executeUpdate();


            String empleado1="INSERT INTO employees VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia2=con.prepareStatement(empleado1);

            sentencia2.setInt(1,89);
            sentencia2.setString(2,"45ssa");
            sentencia2.setString(3,"45ff");
            sentencia2.setString(4,"45fsf");
            sentencia2.setString(5,"45vfg");
            sentencia2.setString(6,"45");
            sentencia2.setString(7,"45nhg");
            sentencia2.setString(8,"45sfsf");
            sentencia2.setString(9,"45wad");

            sentencia2.executeUpdate();


            String empleado2="INSERT INTO employees VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia3=con.prepareStatement(empleado2);

            sentencia3.setInt(1,8974);
            sentencia3.setString(2,"45ssa");
            sentencia3.setString(3,"45ff");
            sentencia3.setString(4,"45fsf");
            sentencia3.setString(5,"45vfg");
            sentencia3.setString(6,"45");
            sentencia3.setInt(7,45545);
            sentencia3.setString(8,"45sfsf");
            sentencia3.setString(9,"45wad");

            sentencia3.executeUpdate();


            String cliente="INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia4=con.prepareStatement(cliente);

            sentencia4.setInt(1,4215465);
            sentencia4.setString(2,"45ssa");
            sentencia4.setString(3,"45ff");
            sentencia4.setString(4,"45fsf");
            sentencia4.setString(5,"45vfg");
            sentencia4.setString(6,"45");
            sentencia4.setString(7,"45nhg");
            sentencia4.setString(8,"45sfsf");
            sentencia4.setString(9,"45wad");
            sentencia4.setString(10,"45wad");
            sentencia4.setString(11,"45wad");
            sentencia4.setInt(12,8974);
            sentencia4.setString(13,"25.45");

            sentencia4.executeUpdate();

            con.commit();


        } catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (con!=null){
                    System.out.println("Dejamos la BBDD en estado consistente.");
                    con.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }


    }


}
