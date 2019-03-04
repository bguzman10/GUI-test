import java.awt.*;
import javax.swing.*;

public class TopLvlWindow {
   
   /**function to create window.
   */
   
   public static void createWindow() {
      
      JFrame frame = new JFrame("Text box GUI.");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JLabel textLabel = new JLabel("Hello!",
         SwingConstants.CENTER); 
         //dimensions
      textLabel.setPreferredSize(new Dimension(500, 300)); 
      frame.getContentPane().add(textLabel, BorderLayout.CENTER);
      
      frame.setLocationRelativeTo(null);
      frame.pack();
      frame.setVisible(true);
      
   }
     //creates window
     
   public static void main(String[] args) {
      createWindow();
   }
     
}