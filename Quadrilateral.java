/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceprogram;

class Quadrilateral {
    
    protected Point a,b,c,d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }
  
    String getCoordinatesAsString() {
        return d.toString()+a.toString()+","+b.toString()+","+c.toString()+",";
    }
    
    @Override
    public String toString() {
        return "Coordinates of Quadrilateral are:\n"+this.getCoordinatesAsString();
    }
}