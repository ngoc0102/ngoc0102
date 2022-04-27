package Shape;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		a = new Point(x1, y1);
		b = new Point(x2, y2);
		c = new Point(x3, y3);
    }
    public double getLength(Point a, Point b){
		return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}
    public void checkTriangle(){
        double A = getLength(a, b), B = getLength(a, c), C = getLength(b, c);
        if ((A + B) > C && (A + C) > B && (B + C) > A){
            if (A == B && A == C){
                System.out.println("Tam giác đều!");
            }
            else if(Math.pow(A, 2) + Math.pow(B, 2) == Math.pow(C, 2)||
            Math.pow(A, 2) + Math.pow(C, 2) == Math.pow(B, 2)||
            Math.pow(B, 2) + Math.pow(C, 2) == Math.pow(A, 2)){
                System.out.println("Tam giác vuông");
            } else System.out.println("Tam giác thường");
        }
        else System.out.println("Không tạo thành tam giác!");
    }
    
}
