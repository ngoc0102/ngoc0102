package Package;
import java.util.Scanner;
public class Person{
  protected String name;
  protected int age;
  Scanner sc = new Scanner(System.in);
  public void addName(){
    System.out.println("Type name");
    name = sc.nextLine();
  }
  public void addAge(){
    System.out.println("Type age");
    age = sc.nextInt();
  }
  public void displayName(){
    System.out.println("Name: "+name);
  }
  public void displayAge(){
    System.out.println("Age: "+age);
  }
} 