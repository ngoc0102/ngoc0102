package Shapes;
import java.util.Scanner;
public class PhuongTrinhBacHai {
  Double hesoA, hesoB, hesoC ;
  public void NhapCacHeSo(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập hệ số A: ");
    hesoA = sc.nextDouble();
    System.out.println("Nhập hệ số B: ");
    hesoB = sc.nextDouble();
    System.out.println("Nhập hệ số C: ");
    hesoC = sc.nextDouble();
  }
  public void GiaiPhuongTrinh(){
    Double x1,x2;
    Double delta = hesoB*hesoB - 4*hesoA*hesoC;
    if (delta < 0) {
      System.out.println("Phương trình vô nghiệm!");
    } else if (delta == 0) {
      x1 = -hesoB / (2 * hesoA);
      System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
    } else {
      x1 = (-hesoB + Math.sqrt(delta)) / (2 * hesoA);
      x2 = (-hesoB - Math.sqrt(delta)) / (2 * hesoA);
      System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
    }
  }
}