package Shapes;
import java.util.Scanner;
public class HinhChuNhat {
  float dai;
  float rong;
  float cv;
  float dt;
  public void NhapChieuDai(){
    System.out.println("Nhap chieu dai hcn: ");
    Scanner sc = new Scanner(System.in);
    dai = sc.nextFloat();
  }
  public void NhapChieuRong(){
    System.out.println("Nhap chieu rong hcn: ");
    Scanner sc = new Scanner(System.in);
    rong = sc.nextFloat();
  }
  public void tinhChuVi(){
    cv = 2 * ( dai + rong );
  }
  public void tinhDienTich(){
    dt = dai * rong;
  }
  public void inChuVi(){
    System.out.println("Chu vi HCN : " + cv);
  }
  public void inDienTich(){
    System.out.println("Dien tich HCN : " + dt);
  }
}