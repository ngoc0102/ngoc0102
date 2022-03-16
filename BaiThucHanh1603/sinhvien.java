package Shapes;
import java.util.Scanner;
public class SinhVien {
  String MaSinhVien;
  String HoTen;
  Boolean GioiTinh;
  String DiaChi;
  String NgaySinh;
  public void NhapThongTin(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma sinh vien: ");
    MaSinhVien = sc.nextLine();
    System.out.println("Nhap ho ten: ");
    HoTen = sc.nextLine();
    System.out.println("Nhap dia chi: ");
    DiaChi = sc.nextLine();
    System.out.println("Nhap ngay sinh: ");
    NgaySinh = sc.nextLine();
    System.out.println("Nhap gioi tinh: ");
    GioiTinh = sc.nextBoolean();
  }
  public void InThongTin(){
    System.out.println("Mã sinh viên: " + MaSinhVien);
    System.out.println("Họ tên: " + HoTen);
    if(GioiTinh=true)
    System.out.println("Giới tính: Nam");
    else System.out.println("Giới tính: Nữ");
    System.out.println("Địa chỉ: " + DiaChi);
    System.out.println("Ngày sinh: " + NgaySinh);
  }
}