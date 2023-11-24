package BBDD;
/*
Leer Clientes:
• Recupera todos los clientes de la tabla clientes.
• Muestra la información de cada cliente en la consola.
 */

import java.sql.*;
import java.util.Properties;

public class ReadClient {
    public static void main(String[] args) {

        Connection connector = null;
        String url = "jdbc:mysql://localhost:3306";

        Properties userLogin = new Properties();
        userLogin.put("user", "root");
        userLogin.put("password", "sololoseyo");

        try{
            connector = DriverManager.getConnection("url", userLogin);
            System.out.println("Acceso de lectura correctsa");
        } catch (SQLException e){
            System.out.println("error al conectarse  :" + e.toString() );
        } finally {
            try{
                PreparedStatement statement = null;
                String consulta = "SELECT cliente.name, cliente.surname, cliente.age";
                statement = connector.prepareStatement(consulta);
                

            } catch (SQLException e) {
                System.out.println("Error:  " +e.getErrorCode()+" "+e.getMessage());
            }
        }



    }
}
