import java.util.Scanner;

public class Test10 {
   public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       for(int i =0; i<5; i++){
           System.out.println("Nhập MSSV thứ 0"+(i+1)+":");
           String MSSV = kb.nextLine();
           if(MSSV.matches("B170\\d{5}")) System.out.println("MSSV thứ 0"+(i+1)+" đúng cú pháp!");
           else System.out.println("MSSV thứ 0"+(i+1)+" sai cú pháp!");
       }
   }
}
