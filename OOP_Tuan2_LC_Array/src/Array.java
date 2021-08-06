import java.util.Arrays;

public class Array {
     int []arr= new int[100];

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public void PrintArray(){
        for(int i:arr){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    public void PrintSortArray(){
        Arrays.sort(arr);
        PrintArray();
    }
    public double SumArray(){
        double sum =0;
        for(int i:arr){
            sum += arr[i];
        }
        return sum;
            }
    public void PrintSum(){
        System.out.println("Sum of Array: "+SumArray());
    }
    public double AverageOfArray(){
        double sum = SumArray();
        return sum/ arr.length;
    }
    public void PrintAverage(){
        System.out.println("AverageOfArray: "+AverageOfArray());
    }

}
