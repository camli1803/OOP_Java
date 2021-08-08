import java.util.Scanner;

public class Test16 {
    public static void main(String[] args ){
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = kb.nextLine();
        System.out.print("Nhập kí tự: ");
        char kiTu = kb.nextLine().charAt(0);
        boolean Check = false;
        char MangKiTu[] = chuoi.toCharArray();
        for(int i=0; i<MangKiTu.length; i++){
            if(MangKiTu[i] == kiTu){
                Check = true;
            }
        }
        if(Check == true){
            System.out.println("Có kí tự "+kiTu+" trong chuỗi "+chuoi);
        }
        else System.out.println("Không có kí tự "+kiTu+" trong chuỗi "+chuoi);
    }
}
