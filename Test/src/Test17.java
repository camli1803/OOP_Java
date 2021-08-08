import java.util.Scanner;

public class Test17 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = kb.nextLine();
        System.out.print("Nhập kí tự: ");
        char kiTu = kb.nextLine().charAt(0);
        boolean Check = false;
        char MangKiTu[] = chuoi.toCharArray();
        for(int i=0; i<MangKiTu.length; i++){
            if(kiTu == MangKiTu[i]){
                Check = true;
            }
        }
        if(Check == true){
            System.out.println("Vị trí của kí tự "+kiTu+" trong chuỗi "+chuoi+" là:");
            for(int i=0; i<MangKiTu.length; i++){
                if(kiTu == MangKiTu[i]){
                    System.out.print(i+" ");
                   }
            }
        }
        else{
            System.out.println("Không tồn tại kí tự "+kiTu+" trong chuỗi "+chuoi);
        }
    }
}
