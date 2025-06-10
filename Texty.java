import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Texty extends JFrame implements ActionListener {

    Texty(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Check");

        JTextField text = new JTextField();
        text.setPreferredSize(new Dimension(250,40));
        this.add(button);
        this.add(text);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
