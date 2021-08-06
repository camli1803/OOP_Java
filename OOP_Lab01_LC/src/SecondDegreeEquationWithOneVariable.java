import javax.swing.JOptionPane;
public class SecondDegreeEquationWithOneVariable {
    public static void main(String[] args){
        String strA,strB,strC;
        double Delta;

        do{
            strA = JOptionPane.showInputDialog(null,"Please input a: ",
                    "ax^2+bx+c =0",JOptionPane.INFORMATION_MESSAGE );
            if(Double.parseDouble(strA) ==0){
                JOptionPane.showMessageDialog(null,
                        "Error!!! a != 0","ax^2+bx+c =0",JOptionPane.ERROR_MESSAGE);
            }
        }
        while (Double.parseDouble(strA) ==0);
        strB = JOptionPane.showInputDialog(null,"Please input b: ",
                "ax^2+bx+c =0",JOptionPane.INFORMATION_MESSAGE );
        strC = JOptionPane.showInputDialog(null,"Please input c: ",
                "ax^2+bx+c =0",JOptionPane.INFORMATION_MESSAGE );
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        Delta = b*b - 4*a*c;
        if(Delta ==0){
            JOptionPane.showMessageDialog(null,"The equation has double root: "+((-b)/2*a),
                    "Result",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Delta >0){
            JOptionPane.showMessageDialog(null,
                    "The equation has two distinct roots: "+"x= "+((-b+Math.sqrt(Delta))/(2*a))
                            +","+" x= "+((-b-Math.sqrt(Delta))/(2*a)),"Result",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"The equation has no solution",
                    "Result",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
