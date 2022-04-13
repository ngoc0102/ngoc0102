package Main;

import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class App54 {

    public static void main(String[] args) {
        //Thử nghiệm với lớp Hình Tròn
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapbanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        //Thử nghiệm với lớp Hình Trụ
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();

        //Thử nghiệm với lớp Hình Chữ Nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

        //Thử nghiệm với lớp Hình Vuông
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }
}