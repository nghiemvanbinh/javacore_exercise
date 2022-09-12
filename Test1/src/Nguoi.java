import java.util.Scanner;

public class Nguoi {
    private String fullName;
    private int age;
    private String add;
    private String code;

    public Nguoi() {
    }

    public Nguoi(String fullName, int age, String add, String code) {
        this.fullName = fullName;
        this.age = age;
        this.add = add;
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên: ");
        fullName = scanner.nextLine();
        System.out.println("Nhập vào độ tuổi");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào quê quán");
        add = scanner.nextLine();
        System.out.println("nhập vào mã giáo viên");
        code = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", code=" + code +
                '}';
    }

  public void showInfo(){
      System.out.println(toString());
  }
}
