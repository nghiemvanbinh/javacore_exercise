import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends Sinhvien{

    private int soMuon;
    private Date ngayMuon;
    private Date hanTra;
    private String soHieu;

    public TheMuon() {
    }

    public TheMuon(String hoTen, String maSV, String ngaySinh, String lop, int soMuon, Date ngayMuon, Date hanTra, String soHieu) {
        super(hoTen, maSV, ngaySinh, lop);
        this.soMuon = soMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieu = soHieu;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so muon");
        while (!setSoMuon(Integer.parseInt(scanner.nextLine())));
        System.out.println("Nhap vao ngay muon");
        while (!setNgayMuon(scanner.nextLine()));
        System.out.println("Nhap vao han tra");
        while (!setHanTra(scanner.nextLine()));
        System.out.println("Nhập số hiệu");
        soHieu= scanner.nextLine();
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "soMuon=" + soMuon +
                ", ngayMuon=" + ngayMuon +
                ", hanTra=" + hanTra +
                ", soHieu='" + soHieu + '\'' +
                '}';
    }

    public int getSoMuon() {
        return soMuon;
    }

    public boolean setSoMuon(int soMuon) {
        if(soMuon < 0){
            System.out.println("Nhập sai yêu cầu nhập lại");
            return false;
        }
        else{
            this.soMuon = soMuon;
            return true;
        }

    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public boolean setNgayMuon(String ngayMuon) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try{
            this.ngayMuon  = sdf.parse(ngayMuon);
            return true;
        }catch (ParseException e){
            System.out.println("Nhap khong dung ngay muon, nhập lại");
            return false;
        }
    }

    public Date getHanTra() {
        return hanTra;
    }

    public boolean setHanTra(String hanTra) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try{
            this.hanTra = sdf.parse(hanTra);
            return true;
        }catch (ParseException e){
            System.out.println("Nhập không đúng hạn trả, nhập lại:");
            return false;
        }
    }
}
