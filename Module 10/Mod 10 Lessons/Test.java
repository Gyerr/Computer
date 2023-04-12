import javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler;

public class Test {
    public static int fOf (int x) {
        if (x <= 17) {
            return -10; 
        }
        else {
            return fOf(x-12) + 2;
        }
    }
    public static void main (String [] args) {
        System.out.println(fOf(35));
    }
}
