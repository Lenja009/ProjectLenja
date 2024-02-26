package lesson5.Shapes;

public class App {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(7, 9, 5, "красный", "черный");
        triangle.info();

        Rectangle rectangle = new Rectangle(9, 5, "желтый", "зеленый");
        rectangle.info();

        Circle circle = new Circle(5, "серый", "розовый");
        circle.info();
    }
}

