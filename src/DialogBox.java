import javax.swing.JOptionPane;

public class DialogBox {

    public double inputJPYAmount() {
        String input = JOptionPane.showInputDialog("Input the JPY Amount:");
        double amount = Double.parseDouble(input);

        int confirm = JOptionPane.showConfirmDialog(null, "The input is: " + amount + ". Is it correct?");
        if (confirm != JOptionPane.YES_OPTION) {
            return 0;
        }
        return amount;
    }
    
    public void checkJPYAmount() {
        double amount;
        do {
            amount = inputJPYAmount();
            if (amount <= 0) {
                JOptionPane.showMessageDialog(null, "The JPY amount should be greater than zero.");
            }
        } while (amount <= 0);
    }
    
    //Main method
    public static void main(String[] args) {
        DialogBox dialog = new DialogBox();
        dialog.checkJPYAmount();
    }
}
