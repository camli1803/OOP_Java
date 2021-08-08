import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String chuoi = kb.nextLine();
        if(chuoi.matches(".*\\d.*")){
            System.out.println("Có");
        }
        else System.out.println("Không");

    }
}