package BBDD;
/*
6. Actualizar Cliente:
• Solicita al usuario que ingrese el ID del cliente que desea actualizar.
• Pregunta al usuario qué información desea actualizar (nombre, apellido, edad).
• Realiza la actualización en la base de datos.
• Muestra un mensaje indicando que la actualización ha sido realizada con éxito.
 */

import java.sql.*;
import java.util.Properties;

public class UpdateData {
    public static void main(String[] args) {
        Connection connector = null;
        String url = "jdbc:mysql://localhost:3306";

        Properties userLogin = new Properties();
        userLogin.put("user", "root");
        userLogin.put("password", "sololoseyo");

    }
}
