import java.util.Scanner;

public class Test12 {
    public static void main(String[] args ){
        Scanner kb = new Scanner(System.in);
        int[] MangSoNguyen = new int[100];
        System.out.println("Nhập n: ");
        int n = kb.nextInt();
        int max = 0;
        for(int i =0; i<n; i++){
            System.out.println("Nhập phần tử thứ "+(i+1));
            MangSoNguyen[i] = kb.nextInt();
            if(MangSoNguyen[i] > max){
                max = MangSoNguyen[i];
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất của mảng là: "+ max);
    }
}
