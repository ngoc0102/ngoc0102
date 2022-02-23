import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen duong: ");
        int a = scanner.nextInt();
        if (kiemTraNguyenTo(a)) {
            System.out.println("So " + a + " la so nguyen to");
        } else {
            System.out.println("So " + a + " khong la so nguyen to");
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