
import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void repeatCharacer(){
        System.out.println("/*---------ex1---------*/");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi cần lặp:");
        String str = scanner.nextLine();
        for(int i =0 ;i< str.length();i++){
            char k = str.charAt(i);
            System.out.print(k+""+k);
        }
        System.out.println();
    }
    public static void deleteDuplicates(){
        System.out.println("/*---------ex2---------*/");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi :");
        String str = scanner.nextLine();
        String k="";
        for(int i =0; i < str.length();i++){
            if (k.contains(String.valueOf(str.charAt(i))) == false) {
                k += String.valueOf(str.charAt(i));
            }
        }
        System.out.println("Chuỗi sau khi xóa kí tự trùng lặp là:"+k);
    }
    public static void oneCharacter(){
        System.out.println("/*---------ex3---------*/");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi :");
        String str = scanner.nextLine();
        boolean exist = false;
        for (int i =0;i<str.length();i++){
            String k = str.substring(0,i)+str.substring(i+1);
            if(k.contains(String.valueOf(str.charAt(i))) == false){
                exist = true;
                System.out.println("Kí tự xuất hiện 1 lần trong chuỗi là:"+str.charAt(i));
            }
        }
        if(!exist)System.out.println("Chuỗi bạn nhập không có ký tự nào xuất hiện 1 lần");
    }
    public static void mostCharacter(){
        System.out.println("/*------------ex4---------*/");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi :");
        String str = scanner.nextLine();
        int count = 0, countMax = 0;
        String most = "";
        for (int i = 0; i < str.length(); i++) {
            String k = str.substring(0, i) + str.substring(i + 1);
            count = 0;
            for (int j = 0; j < k.length(); j++) {
                if (str.charAt(i) == k.charAt(j) && str.charAt(i)!='0') {
                    count++;
                    if (countMax <= count) {
                        if (countMax == count) {
                            most = most + String.valueOf(str.charAt(i));
                        } else {
                            most = "";
                            most = String.valueOf(str.charAt(i));
                            countMax = count;
                            count = 0;
                        }
                    }
                }
            }
        }
        String ch = "";
        for (int i = 0; i < most.length(); i++) {
            if (ch.contains(String.valueOf(most.charAt(i))) == false) {
                ch += (String.valueOf(most.charAt(i))+" ");
            }
        }// loại bỏ ký tự trùng lặp

        if(ch.equals(""))
        {
            System.out.println("Chuỗi vừa nhập các tự xuất hiện như nhau:" + str);
        }
        else {
            System.out.println("Kí tự xuất hiện nhiều nhất là:" +ch);
        }
    }
    public static void reverseWord(){
        System.out.println("/*------------ex5---------*/");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi :");
        String str = scanner.nextLine();
        String reverse=" ",reversal=" ";
        int space=0;
        for(int i =0;i< str.length();i++){
            reverse =  str.charAt(i)+reverse;
        }
        for (int i =0 ;i<reverse.length();i++){
            if(reverse.charAt(i)==' ')
            {
                String k = reverse.substring(space,i);
                String kl="";
                for (int j= 0; j < k.length();j++){
                 kl =  k.charAt(j)+kl;
                  //  reversal = k.charAt(j)+reversal;
                }
                reversal = reversal+kl;
                reversal = reversal+" ";
                space = i+1;
            }
        }
        System.out.println("chuỗi sau khi đảo là:"+reversal.substring(1));
    }
    public static void main(String[] args) {
        /*--------ex1------------*/
        repeatCharacer();
        /*--------ex2------------*/
        deleteDuplicates();
        /*--------ex3------------*/
        oneCharacter();
        /*--------ex4------------*/
        mostCharacter();
        /*--------ex5------------*/
          reverseWord();
    }
}