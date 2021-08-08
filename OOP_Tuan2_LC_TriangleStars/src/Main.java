import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhập số dòng của tam giác: ");
        int n = kb.nextInt();
        BuildTriangleStars Star1 = new BuildTriangleStars();
        Star1.setiHeight(n);
        Star1.DisplayTriangleStars();
    }
}