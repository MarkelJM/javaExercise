import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;



public class CreateTables {
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
                String sentenciaTabla  = "CREATE DATABASE IF NOT EXISTS LibraryDB("
                        + "authorId INT AUTO_INCREMENT PRIMARY KEY,"
                        + "name VARCHAR(255) NOT NULL,"
                        + "nationality VARCHAR(255);";

                statement = connector.prepareStatement(sentenciaTabla);
                statement.execute();
                statement.close();



            } catch (SQLException e){
                System.out.println("Error:  " +e.getErrorCode()+" "+e.getMessage());
            }
        }
    }
}


/*
Connection con = null;
        String Url = "jdbc:mysql://localhost:3306";

        try {
            con = DriverManager.getConnection(Url,"root","sololoseyo");
            Statement stmt = con.createStatement();
            stmt.execute("CREATE DATABASE GESTIONCLIENTES;");
            System.out.println("Base de datos creada correctamente");

        } catch (SQLException e){
            System.out.println("Error en la conexion: "+e.toString());

        } finally {
            try {
                //Cerramos posibles conexiones abiertas
                if(con!=null) con.close();

            } catch (Exception e) {
                System.out.println(
                        "Error al cerrar la conexion "+e.toString());
            }
        }
 */
