package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
import java.sql.*;

public class GestionClientes {
    public static void main(String[] args) {
        Connection connector = null;
        String url = "jdbc:mysql://localhost:3306";

        String PASSWORD = "sololoseyo";
        String USER = "root";


        Properties userLogin = new Properties();
        userLogin.put("user", USER);
        userLogin.put("password", PASSWORD);

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica: 1, Añadir usuario");
        System.out.println("Indica: 2, Leer usuario");
        System.out.println("Indica: 3, Modificar usuario");
        System.out.println("Indica: 4, Eliminar usuario");

        String comandoSQL = sc.nextLine();


        try {
            connector = DriverManager.getConnection("url", userLogin);
            System.out.println("Acceso de lectura correctsa");
        } catch (SQLException e) {
            System.out.println("error al conectarse  :" + e.toString());
        } finally {
            try {

                switch (comandoSQL) {
                    case "1":
                        //insert
                        break;
                    case "2":
                        // select
                        break;
                    case "3":
                        //modify
                        break;

                    case "4":
                        //delete
                        break;
                    default:
                        System.out.println("Opción no válida, usa un número correcto");
                }


            } catch(SQLException e){
                System.out.println("Error:  " + e.getErrorCode() + " " + e.getMessage());
            }

        }
    }

    private static  void insterClient(Connection connection, Scanner sc) throws  SQLException{
        System.out.println("Añade un nombre");
        String name = sc.nextLine();
        System.out.println("Añade un nombre");
        String surname = sc.nextLine();
        System.out.println("Añade un nombre");
        String age = sc.nextLine();

        String insterStatement = "INSERT INTO CLIENTE (name, surname, age) VALUES (?, ?, ?)";
        try{
            PreparedStatement statement = null;
            statement = connection.prepareStatement(insterStatement);
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, age);
            statement.executeUpdate();
            statement.close();;


        } catch (SQLException e){
            System.out.println("Error:  " + e.getErrorCode() + " " + e.getMessage());

        }


    }

    private  static void selectClient(Connection connection){
        String insterStatement = "SELECT client.name, client.surname, client.age";
        try{



        } catch (SQLException e){
            System.out.println("Error:  " + e.getErrorCode() + " " + e.getMessage());

        }
    }
}
