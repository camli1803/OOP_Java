import java.util.Scanner;

public class Test11 {
    public static void main(String[] args ){
        int[] MangSoNguyen = new int[100];
        System.out.println("n= ");
        Scanner kb = new Scanner(System.in);
        double n = kb.nextInt();
        double sum =0;
        for(int i=0; i<n; i++){
            System.out.println("Nhập phần tử thứ "+(i+1));
            MangSoNguyen[i] = kb.nextInt();
            sum += MangSoNguyen[i];
        }

        System.out.println("Giá trị trung bình= "+(sum/n));
    }

}
