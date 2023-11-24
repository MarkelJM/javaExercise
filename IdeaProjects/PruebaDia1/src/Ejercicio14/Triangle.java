package Ejercicio14;

public class Triangle extends  Shape {
    double base;
    double height;

    double side1;
    double side2;
    double side3;


    Triangle(double base, double height,double side1, double side2, double side3 ){
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea(double base, double height) {
        double  area = (base * height)/2;
        return  area;
    }

    @Override
    public double calculateTrianglePerimeter(double side1, double side2, double side3) {
        return super.calculateTrianglePerimeter(side1, side2, side3);
    }

    public void showData(){
        System.out.println(calculateArea(base, height));
        System.out.println(calculateTrianglePerimeter(side1,side2,side3));
    }
}
