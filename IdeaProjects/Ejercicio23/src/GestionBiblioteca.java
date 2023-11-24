public class GestionBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        DVD dvd1= new DVD("Harry", "Markel", 120);
        biblioteca.addArrayBilblioteca(dvd1);

        DVD dvd2= new DVD("Potter", "Maite", 130);
        biblioteca.addArrayBilblioteca(dvd2);

        DVD dvd3= new DVD("Popotar", "Lai", 140);
        biblioteca.addArrayBilblioteca(dvd3);

        DVD dvd4= new DVD("Laitxo", "Lai", 150);
        biblioteca.addArrayBilblioteca(dvd4);


        Libro libro1 = new Libro("Who", "Knows", 6);
        biblioteca.addArrayBilblioteca(libro1);

        Libro libro2 = new Libro("I know", "the answer", 100);
        biblioteca.addArrayBilblioteca(libro2);

        Libro libro3 = new Libro("But", "I would", 50);
        biblioteca.addArrayBilblioteca(libro3);

        Libro libro4 = new Libro("Like", "to know", 90);
        biblioteca.addArrayBilblioteca(libro4);

        biblioteca.estadoMaterial();

        //reservar y devolver

        libro3.prestar();

        libro2.prestar();

        biblioteca.estadoMaterial();

        libro3.devolver();
        libro2.devolver();
        biblioteca.estadoMaterial();







    }
}
