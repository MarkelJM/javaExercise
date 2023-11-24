package Ejercicios;
import java.util.Scanner;
public class Ejercicio1 {

    /*
    Práctica 1: Conversión
La gravedad de la Luna es aproximadamente el 17% de la gravedad de la Tierra. Se pide:
1. Crear un programa que, dado un peso de la Tierra, calcule su equivalente en la Luna.
2. El programa debe mostrar por pantalla un mensaje similar a este: “Un peso de 30 kilos
en la Tierra equivalen a X kilos en la Luna
     */
    public static void main(String[] args) {

        double GRAVEDADTIERRA = 9.8;

        double gravedadLuna = GRAVEDADTIERRA * 0.17;
        System.out.println("¿Cuánta masa tienes?");
        Scanner masaTierra = new Scanner(System.in);
        Double convertirDoublePesoFinal = Double.parseDouble(masaTierra.nextLine());
        masaTierra.close();

        double pesoLuna = gravedadLuna * convertirDoublePesoFinal;

        System.out.println(pesoLuna);

        //30kg
        int ej1 = 30;
        System.out.println("Un peso de 30N en la Tierra equivalen a " + (ej1 * gravedadLuna) +"N en la Luna");



        }}
