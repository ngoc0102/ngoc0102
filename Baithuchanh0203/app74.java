import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        n= sc.nextInt();
        int a[] = new int[n];
        System.out.println("Nhập phần tử mảng: ");
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"]= ");
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
                sum=sum+a[i];
        }
        System.out.print("Tổng các số chẵn trong mảng: "+sum);
    }
}
