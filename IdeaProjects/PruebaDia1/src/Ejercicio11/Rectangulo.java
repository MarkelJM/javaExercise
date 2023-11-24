package Ejercicio11;
/*
Práctica 11: Rectángulo
Crea una clase Rectángulo con las siguientes características
• Incluyen un constructor al que se le pasan los datos de base y altura. Si se
intenta dar valor negativo a alguna de las dimensiones, lo corrige al valor
positivo usando Math.abs(int a).
• Un constructor sin parámetros que inicializa un nuevo rectángulo con base
2 y altura 1.
• Un método esCuadrado que indica si el rectángulo actual es un cuadrado.
• Un método area que calcula el área del rectángulo actual.
• Un método perimetro que calcula el perímetro del rectángulo actual.
• Un método gira que gira 90 grados el rectángulo actual (intercambiado la
base por la altura).
 */
public class Rectangulo {
    private int height;
    private int base;

    Rectangulo(int height, int base){
       this.height = height;
       this.base = base;
    }

    Rectangulo(){
        this.height = 2;
        this.base = 1;
    }

    public Boolean checkMinus(int number){
        if(number > 0){
            return  true;
        } else if(number == 0){
            return  false;
        } else{
            return false;
        }
    }

    public int modifyToPositive(int number){
        int positiveNumber = Math.abs(number);
        return  positiveNumber;
    }

    public int calculateArea(int height, int base){
        int area = height * base;
        return area;
    }

    public  int calculatePerimetre(int height, int base){
        int dimensions = 2*height + 2*base;
        return  dimensions;
    }

    public Boolean isSquare(int height, int base){
        if(height == base){
            return true;
        } else {
            return  false;
        }
    }
    /*
    public int[] rotateRectangle(int height, int base){

        int [] newSizes = new int[2];
        int sizeChanger;

        sizeChanger = height;
        height = base;
        base = sizeChanger;
        newSizes = {height, base};


    }
    */
    public int rotateRectangle(int modifyNumber, int modifyTo){
        modifyTo = modifyNumber;
        return modifyTo;

    }
}
