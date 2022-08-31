import java.util.Scanner;

public class CongNhan extends CanBo{
    private int ranks;


    @Override
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Bậc của công nhân là:");
        ranks = scanner.nextInt();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bậc của công nhân là: "+ ranks);
    }

    public CongNhan() {
    }

    public CongNhan(int ranks) {
        this.ranks = ranks;
    }

    public int getRanks() {
        return ranks;
    }

    public void setRanks(int ranks) {
        this.ranks = ranks;
    }

    public CongNhan(String fullName, int age, String gender, String address, int ranks) {
        super(fullName, age, gender, address);
        this.ranks = ranks;
    }
}