// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

/*
Ejercicio 19: Números capicúa
Escribir un programa que pida por teclado un número entero N de más de una cifra y verifique
si es capicúa.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberString = sc.nextLine();


        char letterA;
        char letterB;
        int contador = 0;
        int contadorInverso = 1;
        int posB;
        for (int posA = 0; posA < numberString.length(); posA++) {
            letterA = numberString.charAt(posA);
            posB = numberString.length() - contadorInverso;
            letterB = numberString.charAt(posB);


            if (letterA == letterB) {
                contador++;
                contadorInverso++;
            }

        }
        if(contador == numberString.length()){
            System.out.println(numberString + "es capicua");
        } else {
            System.out.println(numberString + "NO ES CAPICUA");
        }
    }
}







