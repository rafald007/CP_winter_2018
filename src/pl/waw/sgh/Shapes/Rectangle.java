package pl.waw.sgh.shapes;

public class Rectangle extends Shape implements PerimeterCalculation {

    public Rectangle(double parA, double parB) {
        super(parA, parB);
    }

    @Override
    public double calculateSurface() {
        return parA * parB;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * parA + 2 * parB;
    }
}
