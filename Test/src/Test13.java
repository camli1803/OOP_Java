import java.util.Scanner;

public class Test13 {
    public static void main(String[] args ){
        Scanner kb = new Scanner(System.in);
        int[] MangSoNguyen = new int[100];
        System.out.println("Nhập n: ");
        int n = kb.nextInt();
        int min = 0;
        for(int i =0; i<n; i++){
            System.out.println("Nhập phần tử thứ "+(i+1));
            MangSoNguyen[i] = kb.nextInt();
            if(MangSoNguyen[i] < min){
                min = MangSoNguyen[i];
            }
        }
        System.out.println("Phần tử có giá trị nhỏ nhất của mảng là: "+ min);
    }
}

