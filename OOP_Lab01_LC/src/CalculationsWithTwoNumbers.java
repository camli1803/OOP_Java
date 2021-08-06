import javax.swing.JOptionPane;
public class CalculationsWithTwoNumbers {
    public static void main(String[] args){
        String strNum1;
        String strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ",
                "First Number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Second Number", JOptionPane.INFORMATION_MESSAGE);
        Double num1 = Double.parseDouble(strNum1);
        Double num2 = Double.parseDouble(strNum2);
        JOptionPane.showMessageDialog(null,"Sum: "+(num1+num2)+"\nDifference: "+(num1 - num2)
                +"\nProduct: "+(num1 * num2)+"\nQuotient: "+(num1/num2),"Result",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
