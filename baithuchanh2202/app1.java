import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập số thứ nhất: ");
		int a=sc.nextInt();
		System.out.println("nhập số thứ 2: ");
		int b=sc.nextInt();
		sc.close();
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		System.out.println("UCLN của 2 số vừa nhập là: " +a);
		
	}

}