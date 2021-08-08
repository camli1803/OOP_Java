import java.util.Scanner;

public class Test9
{
    public static void main(String[] args)
    {
        int n;
        int Fi;
        System.out.println("Nhập vào số nguyên:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        Fi = fibonacci.CalculateFi(n);

        System.out.println("Fi(" + n + ") = " + Fi);
    }
}

