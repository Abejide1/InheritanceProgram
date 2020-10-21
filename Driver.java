package inheritanceprogram;



public class Driver {

    public static void main(String[] args) {
        //Quadrilateral
        Point a = new Point(1.1, 1.2);
        Point b = new Point(6.6, 2.8);
        Point c = new Point(6.2, 9.9);
        Point d = new Point(2.2, 7.4);       
        Quadrilateral qua = new Quadrilateral(a, b, c, d);
        System.out.println(qua +"\n");

        //Trapezoid
        Point aT = new Point(0.0, 0.0);
        Point bT = new Point(10.0, 0.0);
        Point cT = new Point(8.0, 5.0);
        Point dT = new Point(3.3, 5.0);
        
        Trapezoid tra = new Trapezoid(aT, bT, cT, dT);
        System.out.println(tra +"\n");

        // Parallelogram
        Point aP = new Point(5.0, 5.0);
        Point bP = new Point(11.0, 5.0);
        Point cP = new Point(12.0, 20.0);
        Point dP = new Point(6.0, 20.0);
        
        Parallelogram par = new Parallelogram(aP, bP, cP, dP);
        System.out.println(par +"\n");

        //Rectangle
        Point aR = new Point(17.0, 14.0);
        Point bR = new Point(30.0, 14.0);
        Point cR = new Point(30.0, 28.0);
        Point dR = new Point(17.0, 28.0);
        
        Rectangle rect = new Rectangle(aR, bR, cR, dR);
        System.out.println(rect +"\n");

        //Square
        Point aS = new Point(4.0, 0.0);
        Point bS = new Point(8.0, 0.0);
        Point cS = new Point(8.0, 4.0);
        Point dS = new Point(4.0, 4.0);
        
        Square squ = new Square(aS, bS, cS, dS);
        System.out.println(squ +"\n");
    }
}
