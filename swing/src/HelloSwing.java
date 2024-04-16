import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("HelloSwing");

        // Create a JLabel with "Hello, World!" text
        JLabel label = new JLabel("Hello, World!");

        // Add the label to the JFrame
        frame.add(label);

        // Set JFrame properties
        frame.setSize(300, 200); // Set size (width, height)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit when close button clicked
        frame.setLocationRelativeTo(null); // Center the JFrame on the screen
        frame.setVisible(true); // Make the JFrame visible
    }
}
