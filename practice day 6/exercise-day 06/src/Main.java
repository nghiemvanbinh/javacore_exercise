import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void regexTwo(String two){
        System.out.println("----------Bai2----------");
        String regex="^[pP]{1}[qQ]{0,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(two);
        if(matcher.find()){
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }
    }
    public static void regexThree(String three){
        System.out.println("----------Bai3------------");
        String regex = "(^[a-z])(-{1}[a-z]{1}-{1})+([a-z]{1}$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(three);
        if(matcher.find()){
            System.out.println("Nhập ok");
        }else {
            System.out.println("Nhập sai rồi");
        }
    }
    public static void regexFour(String four){
        System.out.println("----------Bai4------------");
        String regex= "[A-Z]{1}[a-z]{1}\\d{1}_{1}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(four);
        if(matcher.find()){
            System.out.println("Nhập ok");
        }else {
            System.out.println("Nhập sai rồi");
        }
    }
    public static void regexFive(String five){
        System.out.println("----------Bai5------------");
        String regex= "^[5]{1}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(five);
        if(matcher.find()){
            System.out.println("Bắt đầu là 5");
        }else {
            System.out.println("Không bắt đầu là 5");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLi ql = new QuanLi();
        ql.input();
        ql.show();
        ql.deleteTheMuon();
        ql.show();
        System.out.println("Mời nhập chuỗi");
        regexTwo(scanner.nextLine());
        System.out.println("Mời nhập chuỗi");
        regexThree(scanner.nextLine());
        System.out.println("Mời nhập chuỗi");
        regexFour(scanner.nextLine());
        System.out.println("Mời nhập chuỗi");
        regexFive(scanner.nextLine());
    }
}