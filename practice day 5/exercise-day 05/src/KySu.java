import java.util.Scanner;

public class KySu extends CanBo{
    private String career;

    public KySu(String career) {
        this.career = career;
    }

    @Override
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Nhập vào ngành đào tạo");
        career = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ngành đào tạo là: "+career);
    }

    public KySu(String fullName, int age, String gender, String address, String career) {
        super(fullName, age, gender, address);
        this.career = career;
    }

    public KySu() {
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
