package Ejercicio11B;

public class Calculadora {

    public int sumar(int n1, int n2){
        int suma;
        suma = n1 +n2;
        System.out.println(suma);

        return suma;
    }

    public int restar(int n1, int n2){
        int resta;
        resta = n1  -n2;
        System.out.println(resta);

        return resta;
    }
    public int multiplicaador(int n1, int n2){
        int multiplicacion;
        multiplicacion = n1 *n2;
        System.out.println(multiplicacion);
        return multiplicacion;
    }
    public int dividir(int n1, int n2){
        int division;
        division = n1 / n2;
        System.out.println(division);

        return division;
    }
}
