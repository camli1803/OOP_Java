package MyMatrix;

import java.util.Scanner;
import static MyMatrix.Matrix.InputMatrix;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = kb.nextInt();
        System.out.println("Enter the column: ");
        int col = kb.nextInt();
        System.out.println("Input matrix: ");
        int [][]matrix1 = InputMatrix(row,col);
        System.out.println("Input matrix: ");
        int [][]matrix2 = InputMatrix(row,col);

        Matrix TestMatrix1 = new Matrix();
        TestMatrix1.PrintMatrix(matrix1);
        TestMatrix1.PrintMatrix(matrix2);
        TestMatrix1.PrintSumOfMatrix(matrix1,matrix2);


    }


}
