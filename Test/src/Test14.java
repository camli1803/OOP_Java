import java.util.Scanner;

public class Test14 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = kb.nextInt();
        int[] MangSoNguyen = new int[10];

        for(int i =0; i<n; i++){
            MangSoNguyen[i] = kb.nextInt();

                    }
        System.out.println("Mảng: ");
        for(int i=0; i<n; i++){
            System.out.print(MangSoNguyen[i] +" ");
        }
        System.out.println("\nMảng đảo ngược: ");
        for(int i= n-1; i>=0; i--){
            System.out.print(MangSoNguyen[i] +" ");
        }

}
}
