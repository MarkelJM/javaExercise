// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
Ejercicio 21: Análisis de Datos
Supongamos que estás desarrollando un programa para analizar datos de temperatura. Crea un
programa en Java que realice las siguientes tareas:
• Crea un array de temperaturas temperaturas que almacene las temperaturas de una
semana (por ejemplo, los valores de lunes a domingo).
• Implementa un método que calcule y devuelva la temperatura media de la semana.
• Implementa un método que encuentre y devuelva la temperatura máxima de la semana,
así como el día en que ocurrió.
• Implementa un método que encuentre y devuelva la temperatura mediana de la
semana, así como el día en que ocurrió.
• En el método main, crea un array con temperaturas de ejemplo y utiliza los métodos
implementados para mostrar la temperatura media, máxima y mínima de la semana.

 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            double[] listaTemperatura = {1.2, 29.6, 15.4, -3.3,23.5,16.9,17.8};
            maxTemperature(listaTemperatura);
            mediaTemperature(listaTemperatura);
            medianaTemperature(listaTemperatura);
        }



    public static double maxTemperature(double[] arrayTemperature) {

        double number = arrayTemperature[0];
        for (int t = 0; t< arrayTemperature.length; t++){
            if(arrayTemperature[t] >= number ) {
                 number = arrayTemperature[t] ;
            }

        }
        System.out.println(number + " Temperatura MAX");
        String day = maxDayTemperature(number, arrayTemperature);
        System.out.println(day + " dia MAX");
        return number;
    }

    public  static String maxDayTemperature(double dayT, double[] arrayTemperatura) {
        int position;
        String[] arrayWeekDay = {"Lunes", "Martes", "miércoles", "jueves", "viernes", "sabado", "viernes"};
        position = dayTemperature(arrayTemperatura,dayT);
        //System.out.println(arrayWeekDay[position]);
        return arrayWeekDay[position];
    }

    public static int dayTemperature(double[] lista, double temperature){
        for(int pos = 0; pos <= lista.length; pos++) {
            if(lista[pos] == temperature) {
                return  pos;
            }

        } return 0;

    }

    public static double mediaTemperature(double[] arrayTemperature){
        double media = 0;
        for(int t= 0; t<= arrayTemperature.length; t++) {
            media = media + t;


        }
        double mediaNumber = media / arrayTemperature.length;
        System.out.println(mediaNumber + " media");
        return  mediaNumber;

    }

    public static void medianaTemperature( double[] lista){
        Arrays.sort(lista);
        double mediana;
        if(lista.length % 2 == 0) {
            mediana = (lista[lista.length/2] + lista[(lista.length/2)+1])/2;
            System.out.println(mediana + " mediana");
            //return  lista[(int) mediana];
        } else {
            mediana = lista[lista.length/2];
            System.out.println(mediana + " mediana");
            //return  lista[(int) mediana];
        }
    }



}


