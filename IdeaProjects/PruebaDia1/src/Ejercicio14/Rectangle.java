package Ejercicio14;

public class Rectangle extends  Shape {

    double base;
    double height;
    Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(double base, double height) {
        return super.calculateArea(base, height);
    }

    @Override
    public double calculatePermiter(double base, double height) {
        return super.calculatePermiter(base, height);
    }

    public void showData(){
        System.out.println(calculateArea(base, height));
        System.out.println(calculatePermiter(base,height));
    }
}



