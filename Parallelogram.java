
package inheritanceprogram;

class Parallelogram extends Trapezoid {

    Parallelogram(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    double getWidth() {
        return Math.abs(super.a.getX() - super.b.getX());
    }

    @Override
    public String toString() {
        return "Coordiantes of Parallelogram are:\n" + super.getCoordinatesAsString() + "\nWidth is: " + this.getWidth() + "\nHeight is: " + super.getHeight() + "\nArea is: " + super.getArea();
    }
}
