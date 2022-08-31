import java.util.Scanner;

public class NhanVien extends CanBo{
    private String Congviec;


    @Override
    public void inputInfo() {

        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập công viêc của nhân viên:");
        Congviec = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Công viêc: "+Congviec);
    }

    public NhanVien() {
    }

    public String getCongviec() {
        return Congviec;
    }

    public void setCongviec(String congviec) {
        this.Congviec = congviec;
    }

    public NhanVien(String fullName, int age, String gender, String address, String congviec) {
        super(fullName, age, gender, address);
        this.Congviec = congviec;
    }

    public NhanVien(String congviec) {
        Congviec = congviec;
    }
}
