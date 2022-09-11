import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void addCanBo(ArrayList<CanBo> arrayList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin cán bộ cần thêm");
        CanBo cb = new CanBo();
        System.out.println("Chọn loại cán bộ: 1-Kỹ sư,2-Nhân viên,3-Công nhân");
        int choose = scanner.nextInt();
        CanBo canbo = new CanBo();
        switch (choose) {
            case 1:
                canbo = new KySu();
                break;
            case 2:
                canbo = new NhanVien();
                break;
            case 3:
                canbo = new CongNhan();
                break;
            default:
                System.out.println("Bạn đã nhập sai");
                break;
        }
        canbo.inputInfo();
        arrayList.add(canbo);
    }
    public static void filterCanBo(ArrayList<CanBo> arrayList){
        System.out.println("Nhập vào họ tên bạn muốn tìm kiếm");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean tontai = false;
        for (int i =0;i<arrayList.size();i++){
            if(name.equals(arrayList.get(i).getFullName())){
                System.out.println("In tư cán bộ bạn tìm là");
                arrayList.get(i).showInfo();
                tontai = true;
            }
        }
        if(!tontai) System.out.println("Không có tên cán bộ bạn tìm");
    }
    public static void showInfo(ArrayList<CanBo> arrayList){
        for (int i=0; i <arrayList.size();i++){
            arrayList.get(i).showInfo();
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập vào số cán bộ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<CanBo> ListCanBo = new ArrayList<>();
        for (int i =0;i< n;i++){
           addCanBo(ListCanBo);
        }
        filterCanBo(ListCanBo);
        System.out.println("Thông tin của tất cả các cán bộ là:");
        showInfo(ListCanBo);
    }
}