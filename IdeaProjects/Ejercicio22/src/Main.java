// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

/*
Ejercicio 22: Gestión de Librería
Supongamos que estás desarrollando un sistema para gestionar una librería. Crea las clases
necesarias para representar libros y clientes, y luego implementa un programa principal que
demuestre la funcionalidad básica del sistema.
Crea una clase Libro con los siguientes atributos:
• titulo (String): el título del libro.
• autor (String): el autor del libro.
• anioPublicacion (int): el año de publicación del libro.
• precio (double): el precio del libro.
Crea una clase Cliente con los siguientes atributos:
• nombre (String): el nombre del cliente.
• direccion (String): la dirección del cliente.
• telefono (String): el número de teléfono del cliente.
Implementa métodos en ambas clases para establecer y obtener los valores de los atributos.
Crea una clase GestionLibreria que contenga el método main. En este método, instancia al menos
dos libros y dos clientes. Luego, realiza las siguientes acciones:
• Imprime la información de cada libro y cliente.
• Cambia el precio de uno de los libros.
• Imprime la nueva información del libro modificado.
• Cambia la dirección de uno de los clientes.
• Imprime la nueva información del cliente modificado.
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("harryPotter", "no idea", 1980, 8.99);
        Book book2 = new Book("Hobbyt", "no idea 2", 1970, 10.99);

        Client client1 = new Client("Markel", "no care", "555 123 456");
        Client client2 = new Client("Maite", "no care V.2", "555 654 321");

        book1.modifyPrice(4.99);
        book1.showData();

        client1.modifyAddress("You don't care");
        client1.showData();


    }
}