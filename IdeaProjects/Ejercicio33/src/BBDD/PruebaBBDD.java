package  BBDD;

import java.sql.*;
import java.util.Properties;;


public class PruebaBBDD {
    public static void main(String[] args)  {

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
    }

}
