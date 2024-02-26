package lesson5.Shapes.interfaces;

public interface Circle {
    double calculationArea();

    default double calculationPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    void setColorBorder(String colorBorder);

    void setColorFill(String colorFill);

    void info();
}
