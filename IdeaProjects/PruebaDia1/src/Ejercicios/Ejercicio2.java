package Ejercicios;
import  java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        /*
        Práctica 2: Operaciones matemáticas
Crear un programa que realice algunas operaciones matemáticas.
1. Pedir por consola al usuario que introduzca 3 números enteros y almacenar su valor en
variables.

         */
        System.out.println("Introducir primer numero");
        Scanner entradaN1 = new Scanner(System.in);
        int n1 = Integer.parseInt(entradaN1.nextLine());

        System.out.println("Introduce segundo numero");
        Scanner entradaN2 = new Scanner(System.in);
        int n2 = Integer.parseInt(entradaN2.nextLine());

        System.out.println("Introduce segundo numero");
        Scanner entradaN3 = new Scanner(System.in);
        int n3 = Integer.parseInt(entradaN3.nextLine());
/*
        2. Operación 1. a*b/c Mostrar por consola el resultado
        3. Operación 2. (a*c)%bMostrar por consola el resultado
        4. Operación 3. 2*(a+c-b)/(b*c) Mostrar por consola el resultado
        5. Operación 4. ((a*c)+(b%a))/a-c Mostrar por consola el resultado
        6. Opcional: Repetir las operaciones con números decimales para ver las diferencias de
                resultad
                */
 //2.parte
        System.out.println(n1*n2/n3);
        //3.parte
        System.out.println((n1*n3)%n2);
        System.out.println((n1+n3-n2)/(n2*n3));
        System.out.println(((n1*n3)+(n2%n1))/(n1-n3));



    }
}
