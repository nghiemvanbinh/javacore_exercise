import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLi ql = new QuanLi();
        ql.input();
        ql.show();
        ql.deleteTheMuon();
        ql.show();
    }
}