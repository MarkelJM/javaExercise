package Ejercicio14;

public class Circle extends  Shape{

    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateCircleArea(double radius) {
        return super.calculateCircleArea(radius);
    }

    @Override
    public double calculateCirclePerimeter(double radius) {
        return super.calculateCirclePerimeter(radius);
    }

    public void showData(){
        System.out.println(calculateCircleArea(radius));
        System.out.println(calculateCircleArea(radius));
    }
}
