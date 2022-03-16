import java.util.Scanner;
import Shapes.HinhChuNhat;
import Shapes.HinhTron;
public class App20 {
    public static void  main(String args[]){
        HinhTron ht = new HinhTron();
        HinhChuNhat hcn = new HinhChuNhat();
        ht.NhapBanKinh();
        ht.InBanKinh();
        ht.TinhChuVi();
        ht.InChuVi();
        ht.TinhDienTich();
        ht.InDienTich();
        hcn.NhapChieuDai();
        hcn.NhapChieuRong();
        hcn.tinhChuVi();
        hcn.inChuVi();
        hcn.tinhDienTich();
        hcn.inDienTich();
    }
}