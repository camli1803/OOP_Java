import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter the number one: ");
        Double n1 = Keyboard.nextDouble();
        System.out.println("Enter the number two: ");
        Double n2 = Keyboard.nextDouble();
        System.out.println("Enter the number three: ");
        Double n3 = Keyboard.nextDouble();
        if(n1+n2> n3 && n2+n3 > n1 && n1+n3>n2){
           if(n1*n1 + n2*n2 == n3*n3 || n2*n2 + n3*n3 == n1*n1 || n1*n1 + n3*n3 == n2*n2)
               System.out.println("RIGHT TRIANGLE!!!");

           else
               System.out.println("This is not a right triangle!");

        }
        else
            System.out.println("These are not edge of triangle!!!");
    }
}
