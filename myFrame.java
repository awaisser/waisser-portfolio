import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
   myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Mastermind: The Game");
        this.setResizable(false);
        JButton button = new JButton("Press");
        this.getContentPane().add(button); // Adds Button to content pane of frame
        this.setVisible(true);
        this.getContentPane().setBackground(Color.PINK);
    }

}
