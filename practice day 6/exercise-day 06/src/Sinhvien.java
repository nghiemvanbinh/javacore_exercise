import java.util.Scanner;

public class Sinhvien {
    private String hoTen;
    private String maSV;
    private String ngaySinh;
    private String lop;

    public Sinhvien() {
    }

    public Sinhvien(String hoTen, String maSV, String ngaySinh, String lop) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ho ten");
        hoTen = scanner.nextLine();
        System.out.println("nhap vao ngay sinh");
        ngaySinh = scanner.nextLine();
        System.out.println("nhap vao lop");
        lop = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "hoTen='" + hoTen + '\'' +
                ", maSV='" + maSV + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }
    public void showInfo(){
        System.out.println(toString());
    }

}
