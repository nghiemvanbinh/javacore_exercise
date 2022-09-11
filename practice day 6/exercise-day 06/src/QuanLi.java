import java.util.ArrayList;
import java.util.Scanner;

public class QuanLi {
    private ArrayList<TheMuon> themuon = new ArrayList<>();

    public QuanLi() {
    }

    public void addTheMuon(TheMuon tm){
        themuon.add(tm);
    }
    public void input(){
        System.out.println("Nhập vào số lượng thẻ mượn");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =0; i<n ;i++){
            TheMuon tm = new TheMuon();
            System.out.println("Nhập vào thông tin thẻ");
            tm.inputInfo();
            addTheMuon(tm);
        }
    }
    public void show(){
        System.out.println("thông tin các thẻ là");
        for(int i=0;i<themuon.size();i++){
            themuon.get(i).showInfo();
        }
    }
    public void deleteTheMuon(){
        System.out.println("Nhập vào mã số hiệu thẻ muốn xóa");
        Scanner scanner = new Scanner(System.in);
        String sohieu = scanner.nextLine();
        for (int i=0;i<themuon.size();i++){
            if(themuon.get(i).getSoHieu().equalsIgnoreCase(sohieu)){
                themuon.remove(i);
            }
        }
    }
}
