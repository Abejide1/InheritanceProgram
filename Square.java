/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceprogram;

//It is given in the question that square inherits from parallelogram
class Square extends Parallelogram {

    Square(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    @Override
    public String toString() {
        return "Coordiantes of Square are:\n" + 
                super.getCoordinatesAsString() +
                "\nSide is: " + super.getWidth() +
                "\nArea is: " + super.getArea();
    }
}
