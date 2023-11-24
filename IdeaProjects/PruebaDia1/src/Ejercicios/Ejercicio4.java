package Ejercicios;
import  java.util.Scanner;
import java.lang.String;

public class Ejercicio4 {
    public static void main(String[] args) {


        System.out.println("Introduce texto");

        int contador = 0;
        String analizarTexto;


        //flag
        boolean encontradoPunto = false;
        Scanner sc = new Scanner(System.in);


        do{

            analizarTexto = sc.nextLine();
            for(int i = 0;i < analizarTexto.length(); i++){
                if (analizarTexto.charAt(i) == ' '){
                    contador += 1;
                }

            }
        } while( !analizarTexto.equals("."));
        sc.close();
        System.out.println(contador);

    }
}
