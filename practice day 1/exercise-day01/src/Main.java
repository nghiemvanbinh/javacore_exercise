import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void convertFahrenheittoCelsius() {
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex2:Nhap vao do F can doi: ");
        double f = scanner.nextDouble();
        c = ( (double) 5 / 9) * (f - 32);
        System.out.println("ex2:Voi nhiet do: " + f + "do F, nhiet do c tuong ung la: " + c);
    }

    public static void sumofdigits(){
        int sum, sumSum = 0;
        Random rand = new Random();
        int ranNum = rand.nextInt(1000) + 1;
        System.out.println("ex4: So ngau nhien tao ra la: " + ranNum);
        while (ranNum > 0) {
            sum = ranNum % 10;
            ranNum = ranNum / 10;
            sumSum = sumSum + sum;
        }
        System.out.println("ex4: Sum cac chu so la: " + sumSum);
    }

    public static boolean twoInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex5:Nhap vao so thu 1: ");
        int Num1 = scanner.nextInt();
        // -----------------------------------//
        System.out.println("ex5:Nhap vao so thu 2: ");
        int Num2 = scanner.nextInt();
        // -----------------------------------//
        if (Num1 == 10 || Num2 == 10 || (Num1 - Num2) == 10 || (Num1 + Num2) == 10) {
            return true;
        }
        return false;
    }

    public static double BMI() {
        double bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex6:Nhap vao chieu cao cua ban(m) : ");
        double height = scanner.nextDouble();
        if (height <= 0) {
            System.out.println("Ban da nhap sai chieu cao");
            return 0;
        }
        System.out.println("ex6:Nhap vao can nang cua ban(kg): ");
        double weight = scanner.nextDouble();
        // -----------------------------------//
        return bmi = weight / (height * height);
    }

    public static void digitbreak() {
        int middle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex8:Nhap vao so co 6 chu so: ");
        int Num = scanner.nextInt();
        Num = Math.abs(Num);
        if (Num <= 999999) {
            System.out.println(Num);
            System.out.println("ex8: Day so sau khi tach la:");
            for (int i = 5; i >= 0; i--) {
                System.out.print(" " + (Num / (int) Math.pow(10, i)) % 10);
            }
        } else {
            System.out.println("ex8:B???n ???? nh???p h??n 6 ch??? s??? r???i");
        }
    }
    public static void number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("ex9:Nh???p v??o ki???u s??? th???c b???n mu???n: ");
        double f = scanner.nextDouble();
        System.out.println("ex9:s??? tr??? v??? l???n ho???c nh??? h??n ng???u nhi??n l??:" + (f + Math.random()));
    }

    public static void random_ex10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex10:Nh???p v??o gi???i h???n d?????i b???n mu???n: ");
        int Num1 = scanner.nextInt();
        System.out.println("ex10:Nh???p v??o gi???i h???n tr??n b???n mu???n: ");
        int Num2 = scanner.nextInt();
        if (Num2 - Num1 > 0) {
            Random rd = new Random(); // khai b??o 1 ?????i t?????ng Random
            int ranNum = rd.nextInt((Num2 - Num1)) + Num1;
            System.out
                    .println("ex10:S??? ng???u nhi??n sinh ra trong kho???ng t??? " + Num1 + " t???i " + Num2 + " l?? :" + ranNum);
        } else {
            System.out.println("ex10:B???n ???? nh???p sai");
        }
    }

    public static void time_ex11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex11:Nh???p v??o s??? gi??? b???n mu???n(hour):");
        int hour = scanner.nextInt();
        System.out.println("ex11:S??? ng??y l?? " + (hour / 24) + " -- S??? n??m l??: " + (hour / 8760));
        System.out.println("ex11:Nh???p v??o s??? ph??t b???n mu???n(minute):");
        long minute = scanner.nextLong();
        System.out.println("ex11:S??? ng??y l?? " + (minute / 1440) + " -- S??? n??m l??: " + (minute / 527040));
        System.out.println("ex11:Nh???p v??o s??? gi??y b???n mu???n(seconds):");
        long seconds = scanner.nextLong();
        System.out.println("ex11:S??? ng??y l?? " + (seconds / 3600) + " -- S??? n??m l??: " + (seconds / 31622400));

    }

    public static void main(String[] args) {
        /* Begin ex1 */
        int i, n;
        i = 10;
      //  System.out.println("ex1:s??? i l??: " + i++);
        n = ++i % 5;

        // N???u i++ bi???n i gi??? nguy??n gi?? tr??? ban ?????u c???a n??, n???u ++i bi???n i t??ng l??n 1
        // ????n v??? r???i m???i th???c hi???n ph??p t??nh(i=11, n=1)
        System.out.println("ex1:s??? i l??: " + i);
        System.out.println("ex1:s??? n l??: " + n);
        /* End ex1 */
        /*----------------------*/
        /* Begin ex2 */
        convertFahrenheittoCelsius();
        /* End ex2 */
        /*-----------------------*/
        /* Begin ex3 */
        double d =  9f/ 5f;//
        System.out.println("ex3:Gi?? tr??? sau ??p ki???u :" + d);
        /* End ex3 */
        /*-----------*/
        /* Begin ex4 */
        sumofdigits();
        /* End ex4 */
        /*-----------*/
        /* Begin ex5 */
        System.out.println("ex5: Gi?? tr??? tr??? v??? l??: " + twoInt());
        /* End ex5 */
        /*-----------*/
        /* Begin ex6 */
        System.out.println("ex6: Gi?? tr??? bmi c???a b???n l??: " + BMI());
        /* End ex6 */
        /*-----------*/
        /* Begin ex7 */
        System.out.print("ex7:Th???i gian millis hi???n t???i l??  ");
        System.out.println(System.currentTimeMillis());
        /* End ex7 */
        /* Begin ex8 */
        digitbreak();
        /* End ex8 */
        /*-----------------*/
        /* Begin ex9 */
        number();
        /* End ex9 */
        /*-----------------*/
        /* Begin ex10 */
        random_ex10();
        /* End ex10 */
        /* Begin ex11 */
        time_ex11();
        /* End ex11 */
    }
}