package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {

    public float banKinh;

    // Constructor
    public HinhTron() {
        ten = "Hình Tròn";
    }

    public void nhapbanKinh() {
        System.out.println("Bán Kính = ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
}

public void tinhChuVi() {
    chuVi = 2 * PI * banKinh;
}

public void tinhDienTich() {
    dienTich = PI * banKinh * banKinh;
}
} 