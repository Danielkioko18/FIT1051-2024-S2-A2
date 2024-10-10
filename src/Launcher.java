import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcher extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu launchMenu, exitMenu;
    private JMenuItem launchBackpack, launchDialogBox, launchConversion, exitItem;
    private JTextArea textArea;

    // Constructor: To Build the frame with menu and text area
    public Launcher() {
        // Set the frame title
        setTitle("Launcher");

        // Initialize menu bar and menus
        menuBar = new JMenuBar();
        launchMenu = new JMenu("Launch");
        exitMenu = new JMenu("Exit");

        // Initialize menu items
        launchBackpack = new JMenuItem("Launch Backpack");
        launchDialogBox = new JMenuItem("Launch DialogBox");
        launchConversion = new JMenuItem("Launch Conversion");
        exitItem = new JMenuItem("Exit");

        // Add menu items to the menus
        launchMenu.add(launchBackpack);
        launchMenu.add(launchDialogBox);
        launchMenu.add(launchConversion);
        exitMenu.add(exitItem);

        // Add the menus to the menu bar
        menuBar.add(launchMenu);
        menuBar.add(exitMenu);

        // Add action listeners to handle menu item actions
        launchBackpack.addActionListener(this);
        launchDialogBox.addActionListener(this);
        launchConversion.addActionListener(this);
        exitItem.addActionListener(this);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Initialize the text area
        textArea = new JTextArea();
        add(textArea);

        // Set the frame size and default close operation
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Action listener for the menu items
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == launchBackpack) {
            TestBackpack.main(null);  // Launch TestBackpack
        } else if (e.getSource() == launchDialogBox) {
            DialogBox.main(null);  // Launch DialogBox
        } else if (e.getSource() == launchConversion) {
            Conversion.main(null);  // Launch Conversion
        } else if (e.getSource() == exitItem) {
            System.exit(0);  // Exit the program
        }
    }

    // main method to create and show the Launcher frame
    public static void main(String[] args) {
        Launcher launcherApp = new Launcher();
        launcherApp.setVisible(true);  // Show the frame
    }
}