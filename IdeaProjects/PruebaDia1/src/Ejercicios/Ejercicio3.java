package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*
    Práctica 3: Notas
Crear un programa que indique al usuario la nota media global de su curso. Requisitos:
1. El programa pedirá al usuario que introduzca 5 notas, para las asignaturas:
Matemáticas, Física, Química, Lenguaje e Historia.
2. El programa realizará la media de esas cinco notas.
3. El programa indicará al usuario el rango al que equivale la nota final que ha sacado:
a. Entre 0 – 3 Muy deficiente
b. Entre 3 – 5 Insuficiente
c. Entre 5 – 6 Suficiente
d. Entre 6 – 7 Bien
e. Entre 7 – 9 Notable
f. Entre 9 – 10 Sobresalient
     */

        System.out.println("Introducir primer numero");
        Scanner solicitudFísica = new Scanner(System.in);
        double notaFisica = Double.parseDouble(solicitudFísica.nextLine());
        solicitudFísica.close();

        System.out.println("Introduce segundo numero");
        Scanner solicitudMate = new Scanner(System.in);
        double notaMate = Double.parseDouble(solicitudMate.nextLine());
        solicitudMate.close();

        System.out.println("Introduce segundo numero");
        Scanner solicitudQuimica = new Scanner(System.in);
        double notaQuimica = Double.parseDouble(solicitudQuimica.nextLine());
        solicitudQuimica.close();

        System.out.println("Introduce segundo numero");
        Scanner solicitudBiologia = new Scanner(System.in);
        double notaBiologia = Double.parseDouble(solicitudBiologia.nextLine());
        solicitudBiologia.close();

        System.out.println("Introduce segundo numero");
        Scanner solicitudBioquimica = new Scanner(System.in);
        double notaBioquimica = Double.parseDouble(solicitudBioquimica.nextLine());
        solicitudBioquimica.close();

        double[] listaAsignaturas =  {notaBioquimica, notaBiologia, notaFisica, notaQuimica, notaMate};
        double mediaNotas = (notaBioquimica +notaBiologia + notaFisica + notaQuimica + notaMate) / listaAsignaturas.length;

        if (0.0 <= mediaNotas  && mediaNotas>= 3.0) {
            System.out.println("Muy deficiente");
        } else if (3.0 < mediaNotas && mediaNotas < 5.0){
            System.out.println("Deficiente");

        } else {
            System.out.println("Aprobado");
        }
    }




}
