package lesson5.Shapes.interfaces;

public interface Rectangle {
    double calculationArea();

    default double calculationPerimeter(int sideA, int sideB) {
        return 2 * (sideA + sideB);
    }

    void setColorFill(String colorFill);

    void setColorBorder(String colorBorder);

    void info();
}