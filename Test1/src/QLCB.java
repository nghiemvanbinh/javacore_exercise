import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    ArrayList<CBGV> cbgvs = new ArrayList<>();
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cán bộ giáo viên");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            CBGV cb = new CBGV();
            cb.inputInfo();
            cbgvs.add(cb);
        }
    }
    public void deleteCaBo(){
        System.out.println("Nhập vào mã code xóa cán bộ:");
        Scanner scanner =new Scanner(System.in);
        String code = scanner.nextLine();
        for (int i =0;i< cbgvs.size();i++){
            if(cbgvs.get(i).getCode().equalsIgnoreCase(code)){
                cbgvs.remove(i);
            }
        }
        System.out.println("Sau khi xóa theo mã là: ");
        for (int i = 0; i < cbgvs.size(); i++) {
            cbgvs.get(i).showInfo();
        }
    }
    public void LuongLinh(){
        for (int i = 0; i < cbgvs.size(); i++) {
            cbgvs.get(i).setLuongThucLinh(cbgvs.get(i).getLuongCung()+cbgvs.get(i).getLuongThuong()-cbgvs.get(i).getTienPhat());
            System.out.println("Lương lần lượt là: "+ cbgvs.get(i).getLuongThucLinh());
        }
    }
}
