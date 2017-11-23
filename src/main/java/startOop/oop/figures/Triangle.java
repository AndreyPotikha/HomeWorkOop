package startOop.oop.figures;

public class Triangle extends Figura {
    private double sideB;
    private double sideC;


    public Triangle(double x, double y, double a, double b) {
        super(x, y, a);
        sideB = b;
        sideC = Math.sqrt(a * a + b * b);
    }

    @Override
    public double getPerimetr() {
        return getSideA() + sideB + sideC;
    }

    @Override
    public double getSquare() {
        return (getSideA() * sideB) / 2;
    }
}
