import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = kb.nextInt();
        if(n>=0) System.out.println("Đây là số nguyên dương!");
        else System.out.println("Đây là số nguyên âm!");
    }
}