/**
 * @name                    Victoria C
 * @description            Message box swing simulator
 * @last revised            2/16/13

 */
package funny;

import java.awt.*;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Funny extends JFrame { //the hook for the JFrame
    

    
    public Funny() {
        
        setTitle("Class Human Implements Jokes"); //header title
        Font font = new Font("serif", Font.BOLD + Font.PLAIN, 24); //sets font and size
        setFont(font);
        setSize(600, 200); //sets size
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        JLabel L1 = new JLabel("Why are Java programmers so low paid?"); //labels in the frame
        L1.setForeground(Color.BLUE); //sets color
        JLabel L2 = new JLabel("Because they have a tendency to...");
        L2.setForeground(Color.RED);
        JLabel L3 = new JLabel("Object[][]"); //because Object[][] == object to arrays == object to a raise
        L3.setForeground(Color.GREEN);
        
        
        getContentPane().add(L1); //adds label to the Pane
        L1.setAlignmentX(Component.CENTER_ALIGNMENT); //centers the text
        getContentPane().add(L2);
        L2.setAlignmentX(Component.CENTER_ALIGNMENT);
        getContentPane().add(L3);
        L3.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    public static void main(String[] args) {
        
        Funny gui = new Funny();
        gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //prevents zombies
        gui.setLocationRelativeTo(null); //keeps window centered
        gui.pack(); //sets it
        gui.setVisible(true); //makes it actually run
        
    }
}
    
 
