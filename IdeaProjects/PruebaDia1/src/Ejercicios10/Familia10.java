package Ejercicios10;
import java.util.Scanner;

/*
Se requiere un programa que modele el concepto de una persona. Una persona posee nombre,
apellido, número de documento de identidad y año de nacimiento. La clase debe tener un
constructor que inicialice los valores de sus respectivos atributos.
La clase debe incluir los siguientes métodos:
1. Definir un método que imprima por pantalla los valores de los atributos del objeto.
2. En el método main se deben crear dos personas y mostrar los valores de sus
atributos por pantalla.
 */

public class Familia10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miembros = sc.nextInt();
        Persona [] miembrosFamilia = new Persona[miembros];


        for(int i= 0; i< miembros; i++){
            Scanner scName = new Scanner(System.in);
            String name = scName.nextLine();
            Scanner scSurname = new Scanner(System.in);
            String surname = scSurname.nextLine();
            Scanner scDni = new Scanner(System.in);
            String dni = scDni.nextLine();
            Scanner scYear = new Scanner(System.in);
            int year = scYear.nextInt();
            Persona persona = new Persona(name, surname, dni, year);
            miembrosFamilia[i] = persona;
            persona.getName();
            persona.getSurname();
            persona.getDNI();
            persona.getYear();


        }


    }
}
