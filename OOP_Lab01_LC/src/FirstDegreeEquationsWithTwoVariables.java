import javax.swing.JOptionPane;
public class FirstDegreeEquationsWithTwoVariables {
    public static void main(String[] args){
        String strA11,strA12,strB1;
        String strA21,strA22,strB2;
        double D, D1, D2;

        strA11 = JOptionPane.showInputDialog(null,"Please input a11: ",
                "FirstDegreeEquationsWithTwoVariables",JOptionPane.INFORMATION_MESSAGE);
        strA12  = JOptionPane.showInputDialog(null,"Please input a12: ",
                "FirstDegreeEquationsWithTwoVariables",JOptionPane.INFORMATION_MESSAGE);
        strB1   = JOptionPane.showInputDialog(null,"Please input b1: ",
                "FirstDegreeEquationsWithTwoVariables",JOptionPane.INFORMATION_MESSAGE);
        strA21 = JOptionPane.showInputDialog(null,"Please input a21: ",
                "FirstDegreeEquationsWithTwoVariables",JOptionPane.INFORMATION_MESSAGE);
        strA22  = JOptionPane.showInputDialog(null,"Please input a22: ",
                "FirstDegreeEquationsWithTwoVariables",JOptionPane.INFORMATION_MESSAGE);
        strB2   = JOptionPane.showInputDialog(null,"Please input b2: ",
                "FirstDegreeEquationsWithTwoVariables",JOptionPane.INFORMATION_MESSAGE);
        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double b1 = Double.parseDouble(strB1);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b2 = Double.parseDouble(strB2);

        D = a11*a22 - a21*a12;
        D1 = b1*a22 - b2*a12;
        D2 = a11*b2 - a21*b1;

        if(D != 0){
            JOptionPane.showMessageDialog(null,
                    "Equation with solution: (x1,x2)= "+"("+(D1/D)+", "+(D2/D)+")",
                    "Result",JOptionPane.INFORMATION_MESSAGE);
        }
        else if( D1==0 && D2==0){
            JOptionPane.showMessageDialog(null,
                    "The equation has infinitely many solutions","Result",
                    JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            JOptionPane.showMessageDialog(null,
                    "The equation has no solution","Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
