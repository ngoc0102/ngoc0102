import java.text.DecimalFormat;
import java.util.Scanner;

public class AppBai8 {

    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);

        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    

        System.out.println("Nhập vào số các số nguyên có trong dãy: ");
        n = scanner.nextInt();

        /*
         * bắt đầu duyệt từ biến đếm count = 1 
         * nếu count còn <= n thì nhập vào số number thứ count
         * sau đó cộng giá trị của biến number vào biến sum
         * vòng lặp dừng khi biến đếm count > n.
         */
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhập số thứ " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }

        avgNumber = (float) sum / n;
        System.out.println("Trung bình cộng = " + decimalFormat.format(avgNumber));
        scanner.close();
    }

} 