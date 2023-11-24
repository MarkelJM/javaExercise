// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

/*
Ejercicio 20: FizzBuzz
Escribe un programa en Java que imprima los números del 1 al 20. Sin embargo, para los
múltiplos de 3, imprime "Fizz" en lugar del número, y para los múltiplos de 5, imprime "Buzz".
Para los números que son múltiplos de ambos 3 y 5, imprime "FizzBuzz".
Ejemplo de salida esperada:
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz
 */
public class Main {
    public static void main(String[] args) {

         for ( int num = 1; num <= 20; num++){
             if (num % 3 == 0 && num %5== 0){
                 System.out.println("FizzBuzz");
                 continue;
             } else if (num % 5== 0){
                 System.out.println("Buzz");
                 continue;
             } else if (num % 3== 0) {
                 System.out.println("Fizz");
                 continue;
             }
             System.out.println(num);
         }
    }
}