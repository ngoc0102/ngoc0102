package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {

    public float chieuCao;

    //Constructor
    public HinhTru() {
        ten = "Hình Trụ";
}

public void nhapChieuCao() {
    nhapbanKinh();

    System.out.println("Chiều cao = ");
    Scanner scanner = new Scanner(System.in);
    chieuCao = scanner.nextFloat();
}

public void tinhTheTich() {
    tinhDienTich();
    theTich = dienTich * chieuCao;
}
}