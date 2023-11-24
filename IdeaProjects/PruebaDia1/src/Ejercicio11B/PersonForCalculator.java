package Ejercicio11B;

import java.util.Scanner;

/*
Ejercicio 11: Calculadora Básica
Crea una clase en Java llamada Calculadora que implemente una calculadora básica con las
siguientes funcionalidades:
Suma: Un método que toma dos números como parámetros y devuelve la suma de ambos.
Resta: Un método que toma dos números como parámetros y devuelve la resta del primero
menos el segundo.
Multiplicación: Un método que toma dos números como parámetros y devuelve su producto.
División: Un método que toma dos números como parámetros y devuelve el cociente
resultante de la división del primero entre el segundo. Si el segundo número es cero, debe
mostrar un mensaje indicando que la división por cero no está permitida.
En el programa principal, crea una instancia de la clase Calculadora, realiza varias operaciones y
muestra los resultados.
 */
public class PersonForCalculator {
    public static void main(String[] args) {

        System.out.println("Selecciona Suma : 1");
        System.out.println("Selecciona resta: 2");
        System.out.println("Selecciona multiplicador : 3");
        System.out.println("Selecciona division : 4");


        Scanner selectMath = new Scanner(System.in);
        String selectedMath = selectMath.nextLine();

        Calculadora calculadora = new Calculadora();

        System.out.println("Selecciona primer número: ");
        Scanner firstNumber = new Scanner(System.in);
        String selectedFirstNumber = firstNumber.nextLine();
        int convertedFirstNumber = Integer.parseInt(selectedFirstNumber);

        System.out.println("Selecciona segundo número: ");
        Scanner secondNumber = new Scanner(System.in);
        String selectedSecondNumber = secondNumber.nextLine();
        int convertedSecondNumber = Integer.parseInt(selectedSecondNumber);




        switch(selectedMath){
            case "1":
                calculadora.sumar(convertedFirstNumber,convertedSecondNumber);
            case "2":
                calculadora.restar(convertedFirstNumber,convertedSecondNumber);

            case "3":
                calculadora.multiplicaador(convertedFirstNumber,convertedSecondNumber);

            case "4":
                calculadora.dividir(convertedFirstNumber,convertedSecondNumber);

            default:
                System.out.println("No has seleccionado correctamente, te recomiendo llamar a la clase de nuevo o añadir un while hasta tener valor correcto");

        }


    }



}
