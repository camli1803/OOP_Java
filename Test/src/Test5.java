import java.util.Scanner;

public class Test5 {
    public static void main(String[] args)
    {
        String MSSV;
        System.out.println("Nhập vào MSSV:");
        Scanner Keyboard = new Scanner(System.in);

        MSSV = Keyboard.nextLine();

        if (MSSV.matches("\\d{8}"))
            System.out.println("Phù hợp");
        else
            System.out.println("Không phù hợp");


    }
}