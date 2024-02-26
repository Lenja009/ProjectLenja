package lesson5.Shapes;

public class Rectangle implements lesson5.Shapes.interfaces.Rectangle {
    private int sideA;
    private int sideB;
    String colorFill;
    String colorBorder;

    public Rectangle(int sideA, int sideB, String colorFill, String colorBorder) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double calculationArea() {
        return sideA * sideB;
    }

    @Override
    public void setColorFill(String colorFill) {
        this.colorFill = colorFill;
    }

    @Override
    public void setColorBorder(String colorBorder) {
        this.colorBorder = colorBorder;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side_a=" + sideA +
                ", side_b=" + sideB +
                ", colorFill='" + colorFill + '\'' +
                ", colorBorder='" + colorBorder + '\'' +
                '}';
    }

    @Override
    public void info() {
        System.out.println("Периметр прямоугольника : " + calculationPerimeter(2, 4));
        System.out.println("Площадь прямоугольника: " + calculationArea());
        System.out.println("Цвет заливки: " + colorFill);
        System.out.println("Цветовая граница: " + colorBorder);
    }
}

