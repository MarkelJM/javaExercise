package Ejercicios;
import java.util.Scanner;

/*
Práctica 5: Amstrong
Desarrollar un programa que determine si un número es un número de Amstrong. Un número
de Amstrong es aquel que es igual a la suma de sus dígitos elevados a la potencia de su número
de cifras.
Recursos para el ejercicio:
• Math.floor: Devuelve el máximo entero menor o igual a un número pasado como
parámetro.
• Math.log10: Devuelve el logaritmo en base 10 de un número pasado como
parámetro.
• Math.pow: Devuelve el valor del primer argumento elevado a la potencia del
segundo argumento.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String analizarTexto = sc.nextLine();


        int suma = 0;
        for(int i = 0;i < analizarTexto.length(); i++){
            String letra = String.valueOf(analizarTexto.charAt(i));
            //letra = String.valueOf(Integer.parseInt(letra));

            suma += Math.pow(Double.parseDouble(letra), analizarTexto.length());
        }
        System.out.println(suma);

    }
}
