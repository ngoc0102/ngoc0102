package Shapes;
import java.util.Scanner;
public class Person {
  String PersonID;
  String PersonName;
  Boolean Gender;
  String Address;
  public void NhapThongTin(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập PersonID: ");
    PersonID = sc.nextLine();
    System.out.println("Nhập PersonName: ");
    PersonName = sc.nextLine();
    System.out.println("Nhập Address: ");
    Address = sc.nextLine();
    System.out.println("Nhập Gender: ");
    Gender = sc.nextBoolean();
  }
  public void InThongTin(){
    System.out.println("PersonID: " + PersonID);
    System.out.println("PersonName: " + PersonName);
    if(Gender=true)
    System.out.println("Giới tính: Nam");
    else System.out.println("Giới tính: Nữ");
    System.out.println("Address: " + Address);
  }
}