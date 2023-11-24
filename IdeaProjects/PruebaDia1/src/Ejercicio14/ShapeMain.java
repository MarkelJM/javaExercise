package Ejercicio14;

public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3.456);
        Rectangle rectangle = new Rectangle(3.56, 9.566);
        Triangle triangle = new Triangle(5.9, 6.5, 3.5, 8.6,7.6);

        triangle.showData();
        rectangle.showData();
        circle.showData();
    }
}
