import java.util.Scanner;

public class Test6 {
   public static void main(String[] args){
       Scanner Keyboard = new Scanner(System.in);
       System.out.println("Nhap so n: ");
       int n = Keyboard.nextInt();
       int sum =0;
       for(int i =0; i<=n; i++){
           if(i %2 ==0){
               sum += i;
           }
       }
       System.out.println("Tong cua cac so chan tu 0 den "+n+" la: "+sum);
   }
}
