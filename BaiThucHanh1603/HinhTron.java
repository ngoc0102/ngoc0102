package Shapes;
import java.util.Scanner;
public class HinhTron{
  final float Pi=3.14f;
  float r;
  float cv;
  float dt;
  public void NhapBanKinh(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhap ban kinh: ");
      r = sc.nextFloat();
  }
  public void InBanKinh(){
      System.out.println("Ban kinh duong tron la: " + r);
  }
  public void TinhChuVi(){
      cv = Pi * 2 * r;
      }
  public void TinhDienTich(){
      dt = Pi * r * r;
      }

  public void InChuVi(){
    System.out.println("Chu vi hình tròn là " + cv);
  }
  public void InDienTich(){
    System.out.println("Dien tich hình tròn là " + dt);
  }
} 