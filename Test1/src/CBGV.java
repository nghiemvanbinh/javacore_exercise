import java.util.ArrayList;
import java.util.Scanner;

public class CBGV extends Nguoi{
    private int LuongCung;
    private int LuongThuong;
    private int TienPhat;
    private int LuongThucLinh;

    public CBGV() {
    }

    public CBGV(String fullName, int age, String add, String code, int luongCung, int luongThuong, int tienPhat, int luongThucLinh) {
        super(fullName, age, add, code);
        LuongCung = luongCung;
        LuongThuong = luongThuong;
        TienPhat = tienPhat;
        LuongThucLinh = luongThucLinh;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào lương cứng");
        LuongCung = scanner.nextInt();
        System.out.println("Nhập vào lương thương");
        LuongThuong = scanner.nextInt();
        System.out.println("Nhập vào tiền phạt");
        TienPhat = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "CBGV{" +
                "LuongCung=" + LuongCung +
                ", LuongThuong=" + LuongThuong +
                ", TienPhat=" + TienPhat +

                '}';
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(toString());
    }

    public int getLuongThucLinh() {
        return LuongThucLinh;
    }

    public void setLuongThucLinh(int luongThucLinh) {
        LuongThucLinh = luongThucLinh;
    }

    public int getLuongCung() {
        return LuongCung;
    }

    public void setLuongCung(int luongCung) {
        LuongCung = luongCung;
    }

    public int getLuongThuong() {
        return LuongThuong;
    }

    public void setLuongThuong(int luongThuong) {
        LuongThuong = luongThuong;
    }

    public int getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(int tienPhat) {
        TienPhat = tienPhat;
    }
}
