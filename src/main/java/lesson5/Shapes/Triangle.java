package lesson5.Shapes;

public class Triangle implements lesson5.Shapes.interfaces.Triangle {
    private int sideA;
    private int sideB;
    private int sideC;
    boolean possible;
    String colorFill;
    String colorBorder;

    public Triangle(int sideA, int sideB, int sideC, String colorFill, String colorBorder) {
        possible = sideA + sideB > sideC && sideC + sideB > sideA &&
                sideA + sideC > sideB;
        if (possible) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            setColorFill(colorFill);
            setColorBorder(colorBorder);

        } else {
            System.out.println("Невозможно построить треугольник");
        }
    }

    @Override
    public double calculationArea() {
        double area = 0;
        if (possible) {
            double p = (double) (sideA + sideB + sideC) / 2;
            area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        }
        return area;
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
        return "Triangle{" +
                "side_a=" + sideA +
                ", side_b=" + sideB +
                ", side_c=" + sideC +
                ", possible=" + possible +
                ", colorFill='" + colorFill + '\'' +
                ", colorBorder='" + colorBorder + '\'' +
                '}';
    }

    @Override
    public void info() {
        System.out.println("Периметр треугольника : " + calculationPerimeter(2, 4, 5));
        System.out.println("Площадь треугольника: " + calculationArea());
        System.out.println("Цвет заливки: " + colorFill);
        System.out.println("Цветовая граница : " + colorBorder);
    }
}

