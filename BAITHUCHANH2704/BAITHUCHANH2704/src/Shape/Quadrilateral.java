package Shape;

public class Quadrilateral {
    private Point a, b, c, d;
    public Quadrilateral(Point a, Point b, Point c, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }
    public double getLength(Point a, Point b){
		return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}
    public void checkQuadrilateral(){
        double A = getLength(a, b);
        double B = getLength(b, c);
        double C = getLength(c, d);
        double D = getLength(d, a);
        if(Math.pow(A, 2) + Math.pow(B, 2) == Math.pow(C, 2)&&
        Math.pow(A, 2) + Math.pow(C, 2) == Math.pow(B, 2)&&
        Math.pow(B, 2) + Math.pow(C, 2) == Math.pow(A, 2)){
            if (A==B && A==C && A==D){
                System.out.println("Hình vuông");
            }
            else System.out.println("Hình chữ nhật");
        } else System.out.println("Tứ giác!");

    }
    
}
