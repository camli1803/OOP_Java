package MyMatrix;

import java.util.Scanner;

public class Matrix {
    public int soDong(int[][] arr){
        return arr.length;
    }
    public int soCot(int[][] arr){
        return arr[0].length;
    }
    public void PrintMatrix(int [][] arr){
        System.out.println("The Matrix: ");
        for(int i=0; i< soDong(arr);i++){
            for(int j=0; j<soCot(arr); j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
    public void PrintSumOfMatrix(int [][] arr, int[][] arr1){
        System.out.println("The result: ");
        for(int i =0; i< soDong(arr); i++){
            for(int j =0; j < soCot(arr); j++){
                System.out.print((arr[i][j]+arr1[i][j]+"  "));
            }
            System.out.print("\n");
        }
    }
    public static int[][] InputMatrix(int row, int col){
        Scanner kb = new Scanner(System.in);
        int [][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                System.out.print("Input arr["+i+"]["+j+"]= ");
                arr[i][j] = kb.nextInt();

            }
            System.out.print("\n");
        }
        return arr;

    }
}
