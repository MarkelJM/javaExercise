package Ejercicio14;

public class Shape {
    //int base;
    //int height;
    //double radius;
    /*
    Shape(int base; int height){
        this.base = base;
        this.height = height;

    }

    Shape(double radius){
        this.radius = radius;
    }
     */

    public double calculateArea(double base, double height){
        double area = base*height;
        return area;
    }

    public  double calculateCircleArea(double radius){
        double pi = 3.141516;
        double area =2* radius *  pi;
        return area;
    }

    public double calculatePermiter(double base, double height){
        double perimeter = 2* base + 2*height;
        return  perimeter;
    }

    public  double calculateCirclePerimeter(double radius){
        double pi = 3.141516;
        double perimeter = pi+ (Math.pow(radius, 2));
        return perimeter;

    }

    public  double calculateTrianglePerimeter(double side1, double side2, double side3){
        double perimeter = side1+side2+side3;
        return perimeter;
    }
}
