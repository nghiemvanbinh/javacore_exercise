import java.lang.String;

public class Main {
    public static void numberPyramid() {
        int j = 0, k = 1;
        System.out.println("---------ex3----------");
        for (int i = 1; i <= 4; i++) {
            j = 1;
            while (j <= i) {
                System.out.print(k);
                j++;
            }
            k = j;
            System.out.println("");
        }
    }
    public static void numberTriangle() {
        int k = 0, j;
        System.out.println("-------ex4--------");
        for (int i = 0; i < 5; i++) {
            j = 0;
            while (j <= i) {
                System.out.print(++k + " ");
                j++;
            }
            System.out.println("");
        }
    }

    public static void diamond() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if (j >= Math.abs(6 - i) && j <= 12 - Math.abs(i - 6)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void pascalTriangle() {
        int trungGian = 1, t = 0;
        System.out.println("--------ex6-----");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || i == 0)
                    trungGian = 1;
                else {
                    trungGian = trungGian * (i - k + 1) / k;

                }
                System.out.print(" " + trungGian);
                // System.out.print("*" + t);
            }
            System.out.println("");
        }
    }

    public static void invertedTriangle() {
        System.out.println("-------------ex7--------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rightTriangle() {
        System.out.println("-------------ex8--------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if (j >= (6 - i)) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondRhombus() {
        System.out.println("--------------ex9----------------");
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if (j >= Math.abs(6 - i) && j <= 12 - Math.abs(i - 6)) {
                    if (j == 6) {
                        System.out.print(1);
                    } else {
                        System.out.print(Math.abs(6 - j) + 1);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        /*---------------------*/
        System.out.println("------------------------------");
        char c = 65;
        char k = 0;
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if (j >= Math.abs(6 - i) && j <= 12 - Math.abs(i - 6)) {
                    if (j == 6) {
                        c = 65;
                        c = (char) (c + 6 - Math.abs(6 - i));
                        System.out.print(c);
                    } else {
                        System.out.print((char) (k - Math.abs(6 - j)));
                    }
                } else {
                    System.out.print(" ");
                }
            }
            if (i >= 6) {
                k = (char) (c - 1);
            } else {
                k = (char) (c + 1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {


        /*---------------ex1-----------------*/
        System.out.println("ex1");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("------end-ex1-------");
        /*-------------end-ex1----------------*/

        /*---------------ex2----------------*/
        System.out.println("ex2");
        int k = 0, j;
        for (int i = 0; i < 4; i++) {
            j = 0;
            while (j <= i) {
                System.out.print(++k);
                j++;
            }
            System.out.println("");
        }
        /*-------------end-ex2--------------*/
        /*---------------ex3----------------*/
        numberPyramid();
        /*--------------end-ex3-------------*/

        /*-------------ex4--------------*/
        numberTriangle();
        /*---------------end-ex4----------------*/
        /*--------------ex5-------------*/
        System.out.println("----------ex5----------");
        diamond();
        /*-------------end-ex5--------------*/
        /*---------------ex6-------------*/
        pascalTriangle();
        /*--------------end-ex6-------------*/

        /*---------------ex7-------------*/
        invertedTriangle();
        /*--------------end-ex7-------------*/
        /*--------------ex8-------------*/
        rightTriangle();
        /*--------------end-ex8-------------*/
        diamondRhombus();
//        String s = "Nghiêm Văn Bình";
//        for(int i =0; i< s.length();i++){
//            if(s.charAt(i)=='i')
//           System.out.println(i);
//        }
    }
}