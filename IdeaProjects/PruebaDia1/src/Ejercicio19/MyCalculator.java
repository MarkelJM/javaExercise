package Ejercicio19;

import java.util.Scanner;


public class MyCalculator {

    public static void main(String[] args) {

        boolean flag = true;
        System.out.println("Introduce un numero");
        Scanner solicitudMate = new Scanner(System.in);
        while (flag){

            try{
                double notaMate = Double.parseDouble(solicitudMate.nextLine());
                /*
                if(isPositive(notaMate)) {
                    double numberLog = calculateLogaritm(notaMate);
                    double numberRaiz = calculateRaiz(notaMate);
                    System.out.println(numberRaiz);
                    System.out.println(numberLog);
                    flag = false;
                }
                */

                double numberLog = calculateLogaritm(notaMate);
                double numberRaiz = calculateRaiz(notaMate);
                System.out.println(numberRaiz);
                System.out.println(numberLog);
                flag = false;

            } catch ( IllegalArgumentException e){
                System.out.println(e.getMessage() );

            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        solicitudMate.close();





    }


    public static boolean isPositive(double number) throws IllegalArgumentException, ArithmeticException{
        if (number > 0){
            return  true;
        } else {
            return  false;
        }
    }
    public static double calculateLogaritm(double number) throws IllegalArgumentException, ArithmeticException{
        if(!(number >0)){
            throw new IllegalArgumentException(("No puede ser 0 o menor"));
        }
        return Math.log(number);
    }

    public static double calculateRaiz(double number) throws IllegalArgumentException, ArithmeticException{
        if(!(number >=0)){
            throw new ArithmeticException(("No puede ser menor a 0"));
        }
        return Math.sqrt(number);
    }
}
