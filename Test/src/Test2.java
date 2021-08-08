import javax.swing.JOptionPane;
public class Test2 {
    public static void main(String[] args){
        String strNumber;
        strNumber = JOptionPane.showInputDialog(null,"Enter the number:");
        int iNumber = Integer.parseInt(strNumber);
        String strCallNumber;
        switch (iNumber){
            case 1:
                strCallNumber = "Mot";
                break;
            case 2:
                strCallNumber = "Hai";
                break;
            case 3:
                strCallNumber = "Ba";
                break;
            case 4:
                strCallNumber = "Bon";
                break;
            default:
                strCallNumber = "Hihi";
                break;
        }
        JOptionPane.showMessageDialog(null,strCallNumber);

    }
}
