package Shape;

public class App2704 {
    public static void main(String[] args){
        Point a = new Point(2, 3);
        Point b = new Point(0, 3);
        Point c = new Point(2, 1);
        Point d = new Point(3, 3);
        Triangle T = new Triangle(a, b, c);
        Quadrilateral Q = new Quadrilateral(a, b, c, d);
        T.checkTriangle();
        Q.checkQuadrilateral();
    }
}
