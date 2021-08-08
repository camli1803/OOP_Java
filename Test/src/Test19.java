import java.util.Scanner;

public class Test19 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String chuoi = kb.nextLine();
        char [] MangKiTu = chuoi.toCharArray();
        int soLan = 0;
        for(int i=0; i< MangKiTu.length; i++){
            if(MangKiTu[i] == 'a')
                soLan ++;
        }
        System.out.println("Kí tự a xuất hiện "+soLan+" lần.");
    }
}
