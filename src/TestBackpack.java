import javax.swing.JOptionPane;

public class TestBackpack {
    public static void main(String[] args) {
        // Step 1: Create a Backpack object
        Backpack backpackA = new Backpack("Nike", 30);
        System.out.println("An object backpackA of class Backpack has been created");

        // Step 2: Prompt the user to input the volume (>0) and validate it
        int volume = 0;  // Initialize volume variable

        do {
            String input = JOptionPane.showInputDialog("Input a value for volume (>0):");

            try {
                volume = Integer.parseInt(input);  // Parse input as an integer
                if (volume <= 0) {
                    JOptionPane.showMessageDialog(null, "Volume must be > 0", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                volume = 0;  // Reset volume to ensure the loop continues
            }
        } while (volume <= 0);  // Repeat until a valid input is provided

        // Step 3: Set the volume of backpackA and display its category
        backpackA.setVolume(volume);
        String category = backpackA.capacity();
        System.out.println("Backpack category: " + category);
        
        // Step 4: Display the category to the user
        JOptionPane.showMessageDialog(null, "The backpack category is: " + category);
    }
}
