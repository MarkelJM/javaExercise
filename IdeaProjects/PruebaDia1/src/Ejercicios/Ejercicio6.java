package Ejercicios;
/*
Práctica 6: Conversión 2
Al igual que se hizo con la Práctica 1 de conversión de pesos, en este caso se pide crear un
programa que imprima una tabla de conversión de pulgadas a metros. Requisitos:
1. Un metros son 39,37 pulgadas
2. Elaborar el programa desde la pulgada 1 hasta la 144
3. La tabla debe de dejar un espacio libre cada 12 pulgadas para ser más legible.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int metro = 1;
        double conversion = 1.3937;
        //int conversionInt = (int) conversion;
        int maxNumber = 144;
        int salto = 12;
        for(int i = 0;i <= maxNumber; i++){
            if((i % 12)==0){
                System.out.println("...........");

            }
            System.out.println(i*conversion);

        }
    }
}
