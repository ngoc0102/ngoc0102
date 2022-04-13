package App72;

public class main72 {

    public static void main(String[] args) {
        // Khởi tạo các đối tượng sinhVien
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();

        // Set thông tin vào cho các sinh viên
        sinhVien1.setTen(""); 
        // Tên không có
        sinhVien2.setTuoi(17);

        // In thông tin các sinh viên
        System.out.println("Sinh viên 1 có tên: " + sinhVien1.getTen() + ", tuổi: " + sinhVien1.getTuoi());
        System.out.println("Sinh viên 2 có tên: " + sinhVien2.getTen() + ", tuổi: " + sinhVien2.getTuoi());
    }
}