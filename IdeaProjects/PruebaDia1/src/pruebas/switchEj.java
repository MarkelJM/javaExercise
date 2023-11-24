package pruebas;
import  java.util.Scanner;
import java.util.Scanner;

public class switchEj {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        System.out.println("d");
        System.out.println("e");

        String opcion = teclado.nextLine();

        switch (opcion) {
            case "a":
                System.out.println("eleccion a");
                break;
            case "b":
                System.out.println("eleccion b");
                break;
            case "c":
                System.out.println("eleccion c");
                break;
            case "d":
                System.out.println("eleccion d");
                break;
            case "e":
                System.out.println("eleccion e");
                break;

            default:
                System.out.println("no hay eleccion");
                break;
        }

    }
}
