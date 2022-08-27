import java.util.Scanner;
import java.lang.String;
public class Main {


    public static void arrayUser(){
        System.out.println("------------ex1------------");
        Scanner scanner = new Scanner(System.in);
        int n =0;
        do{
            System.out.println("Nhập vào số phần tử của mảng:");
            n = scanner.nextInt();
        }while (n<=0);

        int Arr[]=new int[n];
        for(int i = 0;i< n;i++){
            System.out.println("Mời bạn nhập phần tử thứ:"+i);
            Arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập vào là:");
        for(int i=0;i<n;i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
        System.out.println("Các phần tử chẵn thay đổi là:");
        for(int i =0 ; i< n;i++){
            if(Arr[i]!=0 && Arr[i]%2==0)
                System.out.print(Arr[i]+1+" ");
            else System.out.print(Arr[i]+" ");
        }
    }
    public static void arrMedium(){
        System.out.println();
        System.out.println("------------ex2------------");
        Scanner scanner = new Scanner(System.in);
        int n =0;
        do{
            System.out.println("Nhập vào số phần tử của mảng:");
            n = scanner.nextInt();
        }while (n<=0);

        int Arr[]=new int[n];
        for(int i = 0;i< n;i++){
            System.out.println("Mời bạn nhập phần tử thứ:"+i);
            Arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập vào là:");
        for(int i=0;i<n;i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
        float tb =0;
        int sum = 0;
        for (int i=0;i<n;i++){
            sum += Arr[i];
        }
        tb = (float) sum/n;
        System.out.println("Giá trị trung bình các phần tử mảng bạn vừa nhập là:"+tb);
    }
    public static void arrAdd(){
        System.out.println("-------------ex3--------------");
        System.out.println("Mảng sau khi chèn vào vị trí thứ 3 là:");
       int my_array[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
       int newArr[]   = new int[my_array.length+1];
       for (int i=0;i<newArr.length;i++ ){
           if(i<3)newArr[i]=my_array[i];
           else if(i==3) newArr[i] = 5;
           else newArr[i] = my_array[i-1];
           System.out.print(newArr[i]+" ");
       }
        System.out.println();
    }
    public static void arrFilter(){
        System.out.println("---------------ex4-------------");
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        String fil=" ";
        for(int i =0 ;i<array1.length;i++) {
            for (int j = 0;j<array2.length;j++){
                if(array1[i].contains(array2[j])== true){
                      if(!fil.contains(array1[i])) fil += array1[i]+" ";
               }
            }
        }
        System.out.println("Các phân tử xuất hiện trong cả 2 mảng là:"+fil);
    }
    public static void main(String[] args) {

        /*----------ex1---------*/
        arrayUser();
        /*----------ex2---------*/
        arrMedium();
        /*----------ex3----------*/
        arrAdd();
        /*-----------ex4---------*/
        arrFilter();
    }
}