package App79;

import App79.model.NhanVienFullTime;
import App79.model.NhanVienPartTime;
import App79.util.Configs;

public class main79 {

    public static void main(String[] args) {

        NhanVienFullTime sep = new NhanVienFullTime("Tran Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van Linh"); 
        NhanVienFullTime linh2 = new NhanVienFullTime("Le Thi Linh", 3); 
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);

        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thi Thoi Vu", 240); 

        System.out.println("Loai chuc vu :");
        System.out.println("\t1 = sep " );
        System.out.println("\t2 = linh");
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();

        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }

} 