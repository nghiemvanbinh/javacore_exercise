import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void convertFahrenheittoCelsius(){
         double c;
         Scanner scanner = new Scanner(System.in);
         System.out.println("ex2:Nhập vào độ F cần đổi: ");
         double  f = scanner.nextDouble();
         c = ((double)5/9)*(f-32);
        System.out.println("ex2:Với nhiệt độ: "+f+"độ F, nhiệt độ c tương úng là: "+ c);
    }
    public static void sumofdigits(){
        int sum,sumSum = 0 ;
        Random rand = new Random();
        int ranNum = rand.nextInt(1000)+1;
        System.out.println("ex4: Số ngẫu nhiên tạo ra là: "+ranNum);
        while (ranNum > 0)
        {
            sum = ranNum % 10;
            ranNum = ranNum /10;
            sumSum = sumSum + sum;
        }
        System.out.println("ex4: Tổng các chữ số ngẫu nhiên là: "+sumSum);
    }
    public static boolean twoInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex5:Nhập vào số thứ nhất: ");
        int Num1 = scanner.nextInt();
        //-----------------------------------//
        System.out.println("ex5:Nhập vào số thứ hai: ");
        int Num2 = scanner.nextInt();
        //-----------------------------------//
        if(Num1 == 10 || Num2 == 10 || (Num1 - Num2 ) == 10 || (Num1 + Num2) == 10){
            return true;
        }
        return false;
    }
    public static double BMI(){
        double bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex6:Nhập vào chiều cao của bạn(m) : ");
        double height = scanner.nextDouble();
        if(height <= 0)
        {
            System.out.println("Bạn nhập sai chiều cao");
            return 0;
        }

        System.out.println("ex6:Nhập vào cân nặng của bạn(kg): ");
        double weight = scanner.nextDouble();
        //-----------------------------------//
        return bmi = weight / (height * height);
    }

    public static void digitbreak(){
        int middle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex8:Nhập số nguyên có 6 chữ số: ");
        int Num = scanner.nextInt();
        Num = Math.abs(Num);
        if(Num < 999999) {
            System.out.println(Num);
            System.out.println("ex8: Dãy số sau khi tách là:");
            for (int i = 5; i >= 0; i--) {

                System.out.print(" " + (Num / (int) Math.pow(10, i)) % 10);
            }
        }
        else {
            System.out.println("ex8:Bạn đã nhập hơn 6 chữ số rồi");
        }
    }
    public static void number(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("ex9:Nhập vào kiểu số thực bạn muốn: ");
        double f = scanner.nextDouble();

        System.out.println("ex9:số trả về lớn hoặc nhỏ hơn ngẫu nhiên là:"+(f+Math.random()));
    }
    public static void random_ex10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex10:Nhập vào giới hạn dưới bạn muốn: ");
        int Num1 = scanner.nextInt();
        System.out.println("ex10:Nhập vào giới hạn trên bạn muốn: ");
        int Num2 = scanner.nextInt();
        if(Num2 - Num1 > 0) {
            Random rd = new Random();   // khai báo 1 đối tượng Random
            int ranNum = rd.nextInt((Num2 - Num1))+Num1;
            System.out.println("ex10:Số ngẫu nhiên sinh ra trong khoảng từ " + Num1 + " tới " + Num2 + " là :" + ranNum);
        }
        else {
            System.out.println("ex10:Bạn đã nhập sai");
        }
    }
    public static void time_ex11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex11:Nhập vào số giờ bạn muốn(hour):");
        int hour = scanner.nextInt();
        System.out.println("ex11:Số ngày là "+(hour/24)+" -- Số năm là: "+(hour/8760));
        System.out.println("ex11:Nhập vào số phút bạn muốn(minute):");
        long minute = scanner.nextLong();
        System.out.println("ex11:Số ngày là "+(minute/1440)+" -- Số năm là: "+(minute/527040));
        System.out.println("ex11:Nhập vào số giây bạn muốn(seconds):");
        long seconds = scanner.nextLong();
        System.out.println("ex11:Số ngày là "+(seconds/3600)+" -- Số năm là: "+(seconds/ 31622400));

    }
    public static void main(String[] args) {
        /*Begin ex1*/
        int i,n;
        i = 10;
        n = i++%5;
        //Nếu i++ biến i giữ nguyên giá trị ban đầu của nó, nếu ++i biến i tăng lên 1 đơn vị rồi mới thực hiện phép tính(i=11, n=1)
        System.out.println("ex1:số i là: "+i);
        System.out.println("ex1:số n là: "+n);
        /*End ex1*/
        /*----------------------*/
        /*Begin ex2*/
        convertFahrenheittoCelsius();
        /* End ex2*/
        /*-----------------------*/
        /*Begin ex3*/
        double d =(double)9 / 5;
        System.out.println("ex3:Giá trị sau ép kiểu :"+d);
        /* End ex3*/
        /*-----------*/
        /*Begin ex4*/
        sumofdigits();
        /* End ex4*/
        /*-----------*/
        /*Begin ex5*/
         System.out.println("ex5: Giá trị trả về là: "+ twoInt());
        /* End ex5*/
        /*-----------*/
        /*Begin ex6*/
        System.out.println("ex6: Giá trị bmi của bạn là: "+BMI());
        /* End ex6*/
        /*-----------*/
        /*Begin ex7*/
        System.out.print("ex7:Thời gian millis hiện tại là  ");
        System.out.println(System.currentTimeMillis());
        /* End ex7*/
        /*Begin ex8*/
         digitbreak();
        /* End ex8*/
        /*-----------------*/
        /*Begin ex9*/
         number();
        /* End ex9*/
        /*-----------------*/
        /*Begin ex10*/
        random_ex10();
        /* End ex10*/
        /*Begin ex11*/
         time_ex11();
        /* End ex11*/

    }
}