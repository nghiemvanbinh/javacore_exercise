import java.util.Scanner;

public class HocSinh {
    private String fullname;
    private int  age;
    private String add;

    public HocSinh() {
    }

    public HocSinh(String fullname, int age, String add) {
        this.fullname = fullname;
        this.age = age;
        this.add = add;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if(age <0 ){
            System.out.println("Bạn nhập sai tuổi rồi, nhập lại đi:");
            return false;
        }
        else {

            this.age = age;
            return true;
        }
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên học sinh:");
        fullname = scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi:");
        while (!setAge(Integer.parseInt(scanner.nextLine())));
        System.out.println("Mời bạn nhập quê quán");
        add = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                '}';
    }
    public void showInfo(){
        System.out.println("Thông tin học sinh là"+toString());
    }
}
