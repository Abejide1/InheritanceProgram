/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceprogram;

class Rectangle extends Parallelogram {

    Rectangle(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    @Override
    public String toString() {
        return "Coordiantes of Rectangle are:\n" + super.getCoordinatesAsString() + "\nWidth is: " + super.getWidth() + "\nHeight is: " + super.getHeight() + "\nArea is: " + super.getArea();
    }
}
