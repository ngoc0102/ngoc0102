import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen duong: ");
        int n = scanner.nextInt();
        System.out.println("Cac so nguyen to nho hon " + n + ":");
        for (int i = 0; i < n; i++) {
            if (kiemTraNguyenTo(i)) {
                System.out.print(" " + i);
            }
        }
    }

    private static boolean kiemTraNguyenTo(int a) {
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
} 