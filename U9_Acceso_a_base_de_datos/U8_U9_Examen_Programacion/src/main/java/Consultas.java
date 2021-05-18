import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {

    public static void main(String[] args) {

        Connection con = ConexionBD.getConnection();

       // MostrarOficinas();

        Gson gson = new Gson();

        String lista_oficinas = gson.toJson(MostrarOficinas());

        System.out.println(lista_oficinas);

    }

    public static List<Office> MostrarOficinas(){

        Connection con = ConexionBD.getConnection();

        List<Office> oficinas = new ArrayList<>();

        String consulta ="select *\n" +
                "from offices o";

        try {
            PreparedStatement statement = con.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                Office oficina = new Office("","","","","","","","","");
                oficinas.add(oficina);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

      /*  Gson gson = new Gson();

        String lista_oficinas = gson.toJson(oficinas,oficinas.getClass());*/

        return oficinas;

    }



}
