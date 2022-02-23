import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen duong: ");
        int n = scanner.nextInt();
        System.out.println("Cac so hoan thien nho hon " + n + ":");
        for (int i = 0; i < n; i++) {
            if (kiemTraHoanThien(i)) {
                System.out.print(" " + i);
            }
        }
    }


    private static boolean kiemTraHoanThien(int a) {
        int tong = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0){
                tong += i;
            }
        }
        return tong == a && a > 0;
    }
} 