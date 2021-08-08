import java.util.Scanner;
public class Test7 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = kb.nextInt();
        for(int i =1; i<=20;i++){
            System.out.println(n*i);
        }
    }
}
