/*
CREATE DATABASE IF NOT EXISTS LibraryDB;

USE LibraryDB;

CREATE TABLE IF NOT EXISTS Author (
  authorId INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  nationality VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Book (
  bookId INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  publicationYear INT,
  authorId INT,
  FOREIGN KEY (authorId) REFERENCES Author(authorId)
);

 */

import java.sql.*;
import java.util.Properties;


public class CreateDDBB {
    public static void main(String[] args) {
        Connection con = null;
        String Url = "jdbc:mysql://localhost:3306";

        try {
            con = DriverManager.getConnection(Url,"root","sololoseyo");
            Statement stmt = con.createStatement();
            stmt.execute("CREATE DATABASE LibraryDB;");
            System.out.println("Base de datos creada correctamente");

        } catch (SQLException e){
            System.out.println("Error en la conexion: "+e.toString());

        } finally {
            try {
                if(con!=null) con.close();

            } catch (Exception e) {
                System.out.println(
                        "Error al cerrar la conexion "+e.toString());
            }
        }


    }

}


