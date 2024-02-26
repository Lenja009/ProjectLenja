package lesson5.Shapes;

public class Circle implements lesson5.Shapes.interfaces.Circle {
    private int radius;
    String colorBorder;
    String colorFill;


    public Circle(int radius, String colorFill, String colorBorder) {
        this.radius = radius;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double calculationArea() {
        return Math.PI * radius * radius;
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
        return "Circle{" +
                "radius=" + radius +
                ", colorFill='" + colorFill + '\'' +
                ", colorBorder='" + colorBorder + '\'' +
                '}';
    }

    @Override
    public void info() {
        System.out.println("Периметр круга : " + calculationPerimeter(7));
        System.out.println("Площадь круга: " + calculationArea());
        System.out.println("Цвет заливки: " + colorFill);
        System.out.println("Цветовая граница : " + colorBorder);
    }
}

