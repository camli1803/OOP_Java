/*import java.util.Scanner;

public class Test8 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("n= ");
        int n = kb.nextInt();
        System.out.println("Cac so nguyen to tu 1 den "+n +" la:");
        for(int i=2;i<=n;i++){
            int sum =0;
            for(int j=1;j<=i/2; j++){
                if(i % j ==0) sum++;
            }
            if(sum ==1)
                System.out.println(i);
        }
}
} */
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args)
    {
        int n;
        boolean soNguyenTo = false;
        System.out.println("Nhập vào số nguyên:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        // 1, 2 là 2 số nguyên tố mặc nhiên, không cần xét.
        System.out.print("2 ");
        for (int i = 3; i <= n; i++) // duyệt tất cả phần tử từ 1-20
        {
            /**
             * Gán cho soNguyenTo đúng
             * Nếu sau khi ra khỏi vòng lặp j
             * mà nó vẫn còn là true thì số này là số nguyên tố
             */
            soNguyenTo = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                /**
                 * Gán cho soNguyenTo là false
                 * khi nó chia hết nó bất cứ số nào nhỏ hơn
                 * nó trong khoảng từ 3 - n
                 */
                    soNguyenTo = false;
            }
            if (soNguyenTo == true)
                System.out.print(i + " ");
        }
    }
}

