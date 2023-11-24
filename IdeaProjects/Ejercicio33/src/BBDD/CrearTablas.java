package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class CrearTablas {
    public static void main(String[] args) {

        Connection connector = null;
        String url = "jdbc:mysql://localhost:3306/GESTIONCLIENTES";

        Properties userLogin = new Properties();
        userLogin.put("user", "root");
        userLogin.put("password", "sololoseyo");

        try{
            connector = DriverManager.getConnection(url,userLogin);
            System.out.println("acceso exitoso");

        } catch (Exception e){
            System.out.println("error al conectarse  :" + e.toString() );
        } finally {
            try {
                PreparedStatement statement = null;
                String sentenciaTabla  = "CREATE TABLE cliente("
                        + "idClient INT PRIMARY KEY  AUTO_INCREMENT,"
                        + "name VARCHAR(30),"
                        + "surname VARCHAR(50),"
                        + "age VARCHAR(3));";
                statement = connector.prepareStatement(sentenciaTabla);
                statement.execute();
                statement.close();



            } catch (SQLException e){
                System.out.println("Error:  " +e.getErrorCode()+" "+e.getMessage());
            }
        }





    }

}
