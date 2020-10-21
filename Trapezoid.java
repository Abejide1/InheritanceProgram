
package inheritanceprogram;

class Trapezoid extends Quadrilateral {

    protected double height;

    Trapezoid(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);    
    }

    double getHeight() {
        return Math.abs(super.a.getY() - super.c.getY());
    }

    double getSumOfTwoSides() {
        return Math.abs(super.a.getX() - super.b.getX())
                + Math.abs(super.c.getX() - super.d.getX());
    }

    double getArea() {
        return this.getSumOfTwoSides() * this.getHeight() / 2;
    }

    @Override
    public String toString() {
        return "Coordinates of Trapezoid are:\n" + super.getCoordinatesAsString() + "\nHeight is: " + this.getHeight() + "\nArea is: " + this.getArea();
    }
}
