import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception { 
        //khai bao bien
        double A, B, C, delta, X1, X2 ;
        Scanner lt = new Scanner(System.in);
        System.out.println("Nhap he so A (A # 0): ");
        A = lt.nextDouble();
        System.out.println("Nhap he so B");
        B = lt.nextDouble();
        System.out.println("Nhap he so C");
        C = lt.nextDouble();
        System.out.println("phuong trinh bac 2 vua nhap co dang:" + A + "x^2 + " + B + "x + " + C + " = 0");
        //tinh delta
        delta = B * B - 4 * A * C;
        //tinh nghiem
        if (delta > 0) {
            X1 = (-B + Math.sqrt(delta)) / (2*A);
            X2 = (-B - Math.sqrt(delta)) / (2*A);
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + X1 + " và x2 = " + X2);
        } else if (delta == 0){
            X1 = -B / (2*A);
            System.out.println("phuong trinh co 1 nghiem kep : X1 = X2 = " + X1);
        }else {
            System.out.println("Phương trình vo nghiem!");
        }
    }
}
}