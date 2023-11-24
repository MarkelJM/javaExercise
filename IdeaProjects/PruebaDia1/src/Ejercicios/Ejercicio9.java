package Ejercicios;
import java.util.Scanner;

/*
Práctica 9: Contar vocales
Implementa la función int contarVocales(String) que dada una cadena, cuenta el número de
vocales que existe en la misma. No importa que las vocales estén en mayúsculas o minúsculas y
el resto de caracteres que no sean vocales son ignorados. También se ignoran las vocales
acentuadas.

 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        //String [] arrayVocales = {"a", "o", "i", "o", "u", "A", "E", "I", "O", "U"};

        char[] arrayVocales = {'a', 'o', 'i', 'o', 'u'};
        int contador = 0;
        cadena.toLowerCase();
        for(int caracterPos = 0; caracterPos < cadena.length(); caracterPos++){
            for(char comprobarVocal: arrayVocales ){
                if(cadena.charAt(caracterPos) == comprobarVocal){
                    contador++;
                }
            }


        }




    }
}
