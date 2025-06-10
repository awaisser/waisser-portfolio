import javax.swing.*;
import java.awt.*;

class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("Mastermind: The Game");
        frame.setResizable(false);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.PINK);
    }
}