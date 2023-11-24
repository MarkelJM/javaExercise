/*
Ejercicio 32: Operaciones con Números
Dado un array de números, realiza las siguientes operaciones utilizando Streams:
1. Filtra los números pares.
2. Eleva al cuadrado cada número filtrado.
3. Suma los cuadrados obtenidos.
 */

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StremNumbers {
    public static void main(String[] args) {
        int[] arrayNumber = {1,2,3,4,5,6,7,8,9,10};
        //Stream<Integer> streamDeArrayFull = (Stream<Integer>) Arrays.stream(arrayNumber); //WHY?? (Stream<Integer>)
        int sumofsquare =  IntStream.of(arrayNumber).filter(number -> number % 2 == 0).map(number -> number * number ).sum();
        System.out.println(sumofsquare);
    }
}
