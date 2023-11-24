package Ejercicios;

import java.util.Scanner;

/*
Práctica 7: CandyCalculator
En las fiestas de un barrio hay competiciones deportivas que premian el desempeño en ellas
con cupones que luego puedes cambiar por golosinas. Una barra de caramelo se puede
cambiar por 10 cupones, y un chicle por 3 cupones.
Escribe una clase CandyCalculator que tenga un método candyCalculator que permita:
1. Calcular, dado un número dado de cupones, cuantas barras de caramelo y chicles
puedes obtener si gastas todos tus cupones en barras de caramelo primero, y
utilizas los cupones restantes en chicles.
2. También te tiene que devolver el número de cupones restantes que no puedes
gastar.
3. Devuelve los valores en un array en donde la posición [0] representa las barras de
caramelo, la posición [1] los chicles y la posición [2] los cupones restantes.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int preciocaramelo = 10;
        int precioChicle = 3;

        //cuanto dinero tienes
        Scanner scDinero = new Scanner(System.in);
        String dinero = scDinero.nextLine();
        int dineroInt = Integer.parseInt(dinero);
        int[] listaCupones = new int[3];

        //1)
        int  cantidadCarameloTotal;
        int restoDineroParaChicles;
        int cantidadChicleTotal;
        int sobraDinero;
        cantidadCarameloTotal = dineroInt/preciocaramelo;
        listaCupones[0]=cantidadCarameloTotal;
        restoDineroParaChicles = dineroInt%preciocaramelo;
        cantidadChicleTotal = restoDineroParaChicles/precioChicle;
        listaCupones[1]=cantidadChicleTotal;
        sobraDinero = restoDineroParaChicles%precioChicle;
        listaCupones[2]=sobraDinero;
        System.out.println(cantidadCarameloTotal);
        System.out.println(cantidadChicleTotal);

        //2. También te tiene que devolver el número de cupones restantes que no puedes gastar.
        System.out.println(sobraDinero);

        /*
        3. Devuelve los valores en un array en donde la posición [0] representa las barras de
            caramelo, la posición [1] los chicles y la posición [2] los cupones restantes.
         */
        //double[] inversionCupones =  {cantidadCarameloTotal, cantidadChicleTotal, sobraDinero};
        System.out.println(listaCupones[0] + " caramelos que compraré");
        System.out.println(listaCupones[1] + " chicle que compraré");
        System.out.println(listaCupones[2] + " sobras");
        System.out.println(listaCupones);



    }
}
