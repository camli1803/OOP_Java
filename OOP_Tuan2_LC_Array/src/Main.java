import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input the array: ");
        System.out.print("Input the number of array: ");
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Input arr["+i+"]=");
            arr1[i] = kb.nextInt();
        }
        Array TestArray1 = new Array();
        TestArray1.setArr(arr1);
        TestArray1.PrintArray();
        TestArray1.PrintSortArray();
        TestArray1.PrintSum();
        TestArray1.PrintAverage();

        int[] arr ={3,2,1,5,6,2};
        Array TestArray2 = new Array();
        TestArray2.setArr(arr);
        TestArray2.PrintArray();
        TestArray2.PrintSortArray();
        TestArray2.PrintSum();
        TestArray2.AverageOfArray();

    }
}
