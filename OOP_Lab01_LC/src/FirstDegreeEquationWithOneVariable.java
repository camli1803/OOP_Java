import javax.swing.JOptionPane;
public class FirstDegreeEquationWithOneVariable {
    public static void main(String[] args){
        String strA;
        String strB;
        strA = JOptionPane.showInputDialog(null,"Please input a: ","ax+b=0",
                JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null,"Please input b: ","ax+b=0",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        if(a==0 && b==0){
            JOptionPane.showMessageDialog(null,"The equation has infinitely many solutions","Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if(a==0 && b != 0){
            JOptionPane.showMessageDialog(null,"The equation has no solution",
                    "Result",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"The equation with solution: x= "+(-b/a),
                    "Result",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

