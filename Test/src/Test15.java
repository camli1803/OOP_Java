import java.util.Scanner;

public class Test15 {
    public static void main(String[] args ){
        Scanner kb = new Scanner(System.in);
        String[] MangMSSV = new String[5];
        for(int i =0; i<5; i++){
            MangMSSV[i] = kb.nextLine();
            if(MangMSSV[i].matches("00[2-5]L\\d{4}"))
                System.out.println("Đúng rồi!");
            else{
                System.out.println("Sai rồi!");
                return;
        }
    }
}
}
