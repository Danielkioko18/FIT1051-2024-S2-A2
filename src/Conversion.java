import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Conversion extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel resultLabel;
    private JButton calculateButton;

    // Constructor
    public Conversion() {
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Text field for input
        inputField = new JTextField(10);
        add(inputField);

        // Label to display result (10 spaces)
        resultLabel = new JLabel("          "); // Empty spaces initially
        add(resultLabel);

        // Calculate button
        calculateButton = new JButton("Calculate");
        add(calculateButton);

        // Add action listener to button
        calculateButton.addActionListener(this);
    }
    
    // Perform action when button is clicked
    public void actionPerformed(ActionEvent e) {
        // Get the input from the text field
        String jpyAmount = inputField.getText();
        
        // Convert the input (JPY) to double and calculate USD equivalent
        double jpy = Double.parseDouble(jpyAmount);
        double usd = jpy * 0.0063;

        // Display result on the label
        resultLabel.setText(String.format("%.2f USD", usd));
    }
    
    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of the Conversion class
        Conversion converter = new Conversion();

        // Make the frame visible
        converter.setVisible(true);
    }
}

    

