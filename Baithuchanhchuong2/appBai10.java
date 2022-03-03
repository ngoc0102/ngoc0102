import java.util.Scanner;
public class AppBai10 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);

        System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện: ");
        kyTu = sc.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == chuoi.charAt(i)) {
                count++;
            }
        } 
        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi " + chuoi + " = " + count);
        sc.close();
    }
}