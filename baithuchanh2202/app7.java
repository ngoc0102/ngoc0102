import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        float n;
        float max = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao 1 so thuc: ");
            n = sc.nextFloat();
            if (n > max){
                max = n;
            }

        } while (n != 0);
        System.out.println("Gia tri lon nhat trong cac so vua nhap: " + max);

    }
} 