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

    private static void updateClient(Connection connection, Scanner sc) throws SQLException {
        System.out.println("Ingresa el ID del cliente a actualizar:");
        int id = sc.nextInt();
        sc.nextLine(); // consume the rest of the line
        System.out.println("¿Qué campo deseas actualizar? (nombre, apellido, edad)");
        String field = sc.nextLine();
        String newValue;
        String updateStatement = "";

        switch (field.toLowerCase()) {
            case "nombre":
                System.out.println("Ingresa el nuevo nombre:");
                newValue = sc.nextLine();
                updateStatement = "UPDATE cliente SET name = ? WHERE idClient = ?";
                break;
            case "apellido":
                System.out.println("Ingresa el nuevo apellido:");
                newValue = sc.nextLine();
                updateStatement = "UPDATE cliente SET surname = ? WHERE idClient = ?";
                break;
            case "edad":
                System.out.println("Ingresa la nueva edad:");
                newValue = sc.nextLine();
                updateStatement = "UPDATE cliente SET age = ? WHERE idClient = ?";
                break;
            default:
                System.out.println("Campo no reconocido.");
                return;
        }

        PreparedStatement statement = connection.prepareStatement(updateStatement);
        statement.setString(1, newValue);
        statement.setInt(2, id);
        int rowsAffected = statement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Cliente actualizado con éxito.");
        } else {
            System.out.println("No se encontró el cliente.");
        }
        statement.close();
    }

    private static void deleteClient(Connection connection, Scanner sc) throws SQLException {
        System.out.println("Ingresa el ID del cliente a eliminar:");
        int id = sc.nextInt();
        sc.nextLine(); // consume the rest of the line
        String deleteStatement = "DELETE FROM cliente WHERE idClient = ?";

        PreparedStatement statement = connection.prepareStatement(deleteStatement);
        statement.setInt(1, id);
        int rowsAffected = statement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Cliente eliminado con éxito.");
        } else {
            System.out.println("No se encontró el cliente.");
        }
        statement.close();
    }
}
