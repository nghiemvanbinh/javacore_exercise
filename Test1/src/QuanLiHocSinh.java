import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiHocSinh extends HocSinh{
    ArrayList <HocSinh> hsList = new ArrayList<>();

    public QuanLiHocSinh() {
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
    }

    public void showage(){
        for (int i =0;i<hsList.size();i++){
            if(hsList.get(i).getAge()>20){
                System.out.println("Học sinh hơn 20 tuổi là:");
                hsList.get(i).showInfo();
            }
        }
    }
    public void showAgeAdd(){
        for (int i =0;i<hsList.size();i++){
            if(hsList.get(i).getAge()>23&& hsList.get(i).getAdd().equalsIgnoreCase("DN")){
                System.out.println("Học sinh hơn 23 tuổi và quê ở DN là:");
                hsList.get(i).showInfo();
            }
        }
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số ợng học sinh cần thêm:");
        int n = scanner.nextInt();
        for (int i =0;i<n;i++){
            HocSinh hs = new HocSinh();
            hs.inputInfo();
            hsList.add(hs);
        }

    }
}
