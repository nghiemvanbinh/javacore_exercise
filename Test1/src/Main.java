import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean Bai1() {
        System.out.println("Nhập vào số bạn muốn");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int m = 0;
        boolean state = false;
        while (i > 0) {
            m = i % 10;
            if (m % 2 != 0) {
                state = false;
                break;
            } else {
                state = true;
            }
            i = i / 10;

        }
        return state;
    }

    public static boolean Bai2() {
        System.out.println("Nhập vào chuỗi bạn muốn");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String regex = "[uUeEoOaAiI]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

    public static void Bai3() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời nhập vào số điện thoaị :");

            String string = scanner.nextLine();
            String regex = "^0[1-9]{1}\\d{8}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
                System.out.println("Số điện thoại đúng");
                break;
            } else {
                System.out.println("Số điện thoại sai, nhập lại: 0xxxxxxx");
            }
        }
    }

    public static boolean Bai4() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào phần tử cu mảng");
            n = scanner.nextInt();
        } while (n < 0);
        int arr[] = new int[n];
        System.out.println("Nhập vào phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tủ" + i + ": ");
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] < 0) {
                if (arr[i - 1] > 0 || arr[i + 1] > 0) {
                    count++;
                } else
                    return false;
            } else {
                if (arr[i - 1] < 0 && arr[i + 1] < 0) {
                    count++;
                } else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("kết quả bài 1: " + Bai1());
        System.out.println("kết quả bài 2: " + Bai2());
        Bai3();
        System.out.println("Kết quả bài 4 là: " + Bai4());
        System.out.println("-----------Bài5-----------");
        QuanLiHocSinh ql = new QuanLiHocSinh();
        ql.input();
        ql.showage();
        ql.showAgeAdd();
        System.out.println("------------Bài 6-----------------");
        QLCB qlcb = new QLCB();
        qlcb.input();
        qlcb.deleteCaBo();
        qlcb.LuongLinh();
    }
}