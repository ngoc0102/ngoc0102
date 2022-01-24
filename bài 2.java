import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        //Khai báo biến
        double A,B,C,D,E,F,X,Y;
        Scanner ab = new Scanner(System.in);
        System.out.println("Nhap so A: ");
        A = ab.nextDouble();
        System.out.println("Nhap so B: ");
        B = ab.nextDouble();
        System.out.println("Nhap so C: ");
        C = ab.nextDouble();
        System.out.println("Nhap so D: ");
        D = ab.nextDouble();
        System.out.println("Nhap so E: ");
        E = ab.nextDouble();
        System.out.println("Nhap so F: ");
        F = ab.nextDouble();
        System.out.println("Ta co he 2 phuong trinh " + A +"" +"X" +B+""+"Y"+"="+C +" " +"va"+ " " + D +"" +"X" +E+""+"Y"+"="+F);
        System.out.println("Khi do y= " + (Y=(F-((D*C)/A))/(E-((D*B)/A))));
        System.out.println(" x = " + (X=(C-(B*Y))/A));
    }
}
