package U9_T1;

import java.sql.*;
import java.util.Scanner;

public class Consultas {

    public static void main(String[] args) {

       // PagosCliente();

        // InfoPedido();

        DatosJefe();

    }

    public static void PagosCliente(){

        Connection con = ConexionBD.getConnection();

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Inserte el numero del cliente");
        num = sc.nextInt();

        try {
            Statement statement = con.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select c.contactFirstName, c.contactLastName, c.country, SUM(p2.amount) as suma \n" +
                    "from customers c inner join payments p2 \n" +
                    "on c.customerNumber = p2.customerNumber \n" +
                    "where c.customerNumber ="+num);

            while (rs.next()){

                System.out.println("ContactFirstName: "+ rs.getString("contactFirstName"));
                System.out.println("ContactLastName: "+ rs.getString("contactLastName"));
                System.out.println("Country: "+ rs.getString("country"));
                System.out.println("Suma: "+ rs.getInt("suma"));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }

    public static void InfoPedido(){

        Connection con = ConexionBD.getConnection();

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Inserte el numero de pedido");
        num = sc.nextInt();

        String consulta ="select p.productName, o.priceEach , o.quantityOrdered\n" +
                "from orderdetails o inner join products p \n" +
                "on o.productCode = p.productCode \n" +
                "where o.orderNumber = ?";

        String consulta2 = "SELECT sum(o.quantityOrdered * o.priceEach) as total\n" +
                "FROM orderdetails o\n" +
                "where o.orderNumber = ?";


        PreparedStatement statement = null;
        PreparedStatement statement2 = null;
        try {
            statement = con.prepareStatement(consulta);
            statement.setInt(1,num);
            statement2 = con.prepareStatement(consulta2);
            statement2.setInt(1,num);
            ResultSet rs = statement.executeQuery();
            ResultSet rs2 = statement2.executeQuery();

            while (rs.next()){
                System.out.println("ProductName: "+ rs.getString("productName"));
                System.out.println("PriceEach: "+ rs.getDouble("priceEach"));
                System.out.println("QuantityOrdered: "+ rs.getDouble("quantityOrdered"));
            }

            while(rs2.next()){
                System.out.println("Total: "+ rs2.getDouble(1));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public static void DatosJefe(){

        Connection con = ConexionBD.getConnection();

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Inserte el numero de empleado");
        num = sc.nextInt();

        String consulta ="SELECT e2.firstName, e2.lastName\n" +
                "from employees e inner join employees e2 \n" +
                "on e2.employeeNumber = e.reportsTo \n" +
                "where e.employeeNumber = ?";

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(consulta);
            statement.setInt(1,num);
            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                System.out.println("FirstName: "+ rs.getString("firstName"));
                System.out.println("LastName: "+ rs.getString("lastName"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }

}
