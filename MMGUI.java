import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MMGUI extends JFrame implements ActionListener {
    JButton checkB;
    JButton restart;
    JButton info;
    JButton exit;
    JTextField textM = new JTextField();
    public static String guessing;
    public static boolean go;
    char[] colors = {'r', 'o', 'y', 'g', 'b', 'v'};
    char[] secret = secretGen(colors);
    int lives =8;
    JLabel results1;
    JLabel results2;
    JLabel results3;
    JLabel results4;
    JLabel results5;
    JLabel results6;
    JLabel results7;
    JLabel results8;
    JPanel rHold;
    JPanel greenPanel;
    String[] responses = {"Restart", "Exit game"};

    MMGUI(){
        JLabel infor = new JLabel("Color options are: r o y g b v");
        infor.setForeground(new Color(41, 72, 58));
        infor.setFont(new Font("Helvetica",Font.BOLD,13));
        infor.setVerticalAlignment(JLabel.CENTER);
        infor.setHorizontalAlignment(JLabel.LEFT);
        infor.setBounds(10,50,200,50);

        JLabel infor2 = new JLabel("You have 8 chances.");
        infor2.setForeground(new Color(41, 72, 58));
        infor2.setFont(new Font("Helvetica",Font.BOLD,13));
        infor2.setVerticalAlignment(JLabel.CENTER);
        infor2.setHorizontalAlignment(JLabel.LEFT);
        infor2.setBounds(10,70,200,50);

        JLabel infor3 = new JLabel("Code length = 4");
        infor3.setForeground(new Color(41, 72, 58));
        infor3.setFont(new Font("Helvetica",Font.BOLD,13));
        infor3.setVerticalAlignment(JLabel.CENTER);
        infor3.setHorizontalAlignment(JLabel.LEFT);
        infor3.setBounds(10,90,200,50);

        JLabel title = new JLabel("MASTERMIND");
        title.setForeground(new Color(70, 45, 31));
        title.setFont(new Font("Helvetica",Font.BOLD, 67));
        title.setVerticalAlignment(JLabel.TOP);
        title.setHorizontalAlignment(JLabel.RIGHT);
        title.setBounds(200,0,500,100);

       results1 = new JLabel();
       results1.setVisible(false);
        results2 = new JLabel();
        results2.setVisible(false);
        results3 = new JLabel();
        results3.setVisible(false);
        results4 = new JLabel();
        results4.setVisible(false);
        results5 = new JLabel();
        results5.setVisible(false);
        results6 = new JLabel();
        results6.setVisible(false);
        results7 = new JLabel();
        results7.setVisible(false);
        results8 = new JLabel();
        results8.setVisible(false);

        textM.setPreferredSize(new Dimension(250,40));
        textM.setBounds(200,600,250,40);
        textM.addActionListener(this);

        checkB = new JButton();
        checkB.setBounds(450,600,100,50);
        checkB.setText("Check");
        checkB.addActionListener(this);

        info = new JButton();
        info.setBounds(450,600,100,50);
        info.setText("Info");
        info.addActionListener(this);

        restart = new JButton();
        restart.setBounds(450,600,100,50);
        restart.setText("Restart");
        restart.addActionListener(this);

        exit = new JButton();
        exit.setBounds(450,600,100,50);
        exit.setText("Exit");
        exit.addActionListener(this);

        greenPanel = new JPanel();
        greenPanel.setBackground(new Color(117, 206, 164));
        greenPanel.setBounds(0,0,200,800);
        greenPanel.setLayout(new FlowLayout());

        rHold = new JPanel();
        rHold.setBounds(210,60,430,500);
        rHold.setLayout(new FlowLayout());
        rHold.setBackground((new Color(202, 137, 101)));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,700);
        frame.setTitle("Mastermind: The Game");
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(202, 137, 101));
        rHold.add(results1);
        rHold.add(results2);
        rHold.add(results3);
        rHold.add(results4);
        rHold.add(results5);
        rHold.add(results6);
        rHold.add(results7);
        rHold.add(results8);
        greenPanel.add(infor);
        greenPanel.add(infor2);
        greenPanel.add(infor3);
        greenPanel.add(info);
        greenPanel.add(restart);
        greenPanel.add(exit);
        frame.add(textM);
        frame.add(checkB);
        frame.add(greenPanel);
        frame.add(rHold);
        frame.add(title);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==checkB) {
            guessing = textM.getText();
            if (guessing.length() != 4) {
                JOptionPane.showMessageDialog(null, "Invalid guess.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (lives > 0) {
                    char[] guess = guess();
                    boolean c = check(secret, guess);
                    int co = checkCorrect(secret, guess);
                    int n = checkNear(secret, guess);
                    if (c == true) {
                        System.out.println("Congratulations! You Win!");
                        String sst = Arrays.toString(secret);
                        int answer = JOptionPane.showOptionDialog(null, "Congrats🤘 " +
                                        "Code was " + sst + ".", "You Won!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                null, responses, 0);
                        if (answer == 1)
                            System.exit(0);
                        else if (answer == 0) {
                            lives = 8;
                            results1.setVisible(false);
                            results2.setVisible(false);
                            results3.setVisible(false);
                            results4.setVisible(false);
                            results5.setVisible(false);
                            results6.setVisible(false);
                            results7.setVisible(false);
                            results8.setVisible(false);
                            secret = secretGen(colors);
                        }
                    } else {
                        lives--;
                        if (lives == 7) {
                            String RA = "\n " + guessing + "|| Total correct = " + co + " \n Total partially correct = " + n + "\nYou have " + lives + " lives.";
                            results1.setText(RA);
                            results1.setVisible(true);
                            rHold.add(results1);
                        }
                        if (lives == 6) {
                            String RA = "\n " + guessing + "|| Total correct = " + co + " \n Total partially correct = " + n + "\nYou have " + lives + " lives.";
                            results2.setText(RA);
                            results2.setVisible(true);
                            rHold.add(results2);
                        }
                        if (lives == 5) {
                            String RA = "\n " + guessing + "|| Total correct = " + co + " \n Total partially correct = " + n + "\nYou have " + lives + " lives.";
                            results3.setText(RA);
                            results3.setVisible(true);
                            rHold.add(results3);
                        }
                        if (lives == 4) {
                            String RA = "\n " + guessing + "|| Total correct = " + co + " \n Total partially correct = " + n + "\nYou have " + lives + " lives.";
                            results4.setText(RA);
                            results4.setVisible(true);
                            rHold.add(results4);
                        }
                        if (lives == 3) {
                            String RA = "\n " + guessing + "||Total correct  = " + co + " \n Total partially correct = " + n + "\nYou have " + lives + " lives.";
                            results5.setText(RA);
                            results5.setVisible(true);
                            rHold.add(results5);
                        }
                        if (lives == 2) {
                            String RA = "\n " + guessing + "|| Total correct = " + co + " \n Total partially correct = " + n + "\nYou have " + lives + " lives.";
                            results6.setText(RA);
                            results6.setVisible(true);
                            rHold.add(results6);
                        }
                        if (lives == 1) {
                            String RA = "\n " + guessing + "|| Total correct = " + co + " \n Total partially correct = " + n + "\nYou have " + lives + " lives.";
                            results7.setText(RA);
                            results7.setVisible(true);
                            rHold.add(results7);
                        }
                    }
                }
            }
            if (lives == 0) {
                String sst = Arrays.toString(secret);
                int answer = JOptionPane.showOptionDialog(null, "You ran out of lives. " +
                                "Code was " + sst + ".", "You Lost", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, responses, 0);
                if (answer == 1)
                    System.exit(0);
                else if (answer == 0) {
                    lives = 8;
                    results1.setVisible(false);
                    results2.setVisible(false);
                    results3.setVisible(false);
                    results4.setVisible(false);
                    results5.setVisible(false);
                    results6.setVisible(false);
                    results7.setVisible(false);
                    results8.setVisible(false);
                    secret = secretGen(colors);
                }
            }
        }
            else if (e.getSource()==info){
                JOptionPane.showMessageDialog(null, "The goal of the game is to guess a code consisting of 4 colors." +
                        "\nThe computer generated the code. Type in your guess using only the letters described in Color Options. " +
                        "\nDo not put space between the characters. Total correct means the color you guessed is the correct color in the correct place." +
                        "\nTotal partially correct means the color is in the secret code but in a different place." + "You have 8 lives.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else if (e.getSource()==exit){
                System.exit(0);
            }
            else if(e.getSource()==restart){
                lives =8;
                results1.setVisible(false);
                results2.setVisible(false);
                results3.setVisible(false);
                results4.setVisible(false);
                results5.setVisible(false);
                results6.setVisible(false);
                results7.setVisible(false);
                results8.setVisible(false);
                secret=secretGen(colors);
            }
            }

    public static void main(String[] args) {
        MMGUI hi = new MMGUI();
    }

    public static char[] secretGen(char[] a) {
        Random rand = new Random();
        char[] secret = new char[4];
        for (int i = 0; i < 4; i++) {
            int randomNo = rand.nextInt(a.length);
            secret[i] = a[randomNo];
        }
        return secret;
    }

    public static int checkCorrect(char[] s, char[] g) {
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i] == g[i])
                counter++;
        }
        return counter;
    }

    public static int checkNear(char[] s, char[] g) {
        int counter = 0;
        int max = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i] == 'r')
                max++;
            for (int j = 0; j < 4; j++) {
                if ((s[i] == 'r' && g[j] == 'r' && g[i] != 'r') && i != j && s[j] != 'r') {
                    if (counter < max)
                        counter++;
                }
            }
        }
        max = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i] == 'o')
                max++;
            for (int j = 0; j < 4; j++) {
                if ((s[i] == 'o' && g[j] == 'o' && g[i] != 'o') && i != j && s[j] != 'o') {
                    if (counter < max)
                        counter++;
                }
            }
        }
        max = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i] == 'y')
                max++;
            for (int j = 0; j < 4; j++) {
                if ((s[i] == 'y' && g[j] == 'y' && g[i] != 'y') && i != j && s[j] != 'y') {
                    if (counter < max)
                        counter++;
                }
            }
        }
        max = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i] == 'g')
                max++;
            for (int j = 0; j < 4; j++) {
                if ((s[i] == 'g' && g[j] == 'g' && g[i] != 'g') && i != j && s[j] != 'g') {
                    if (counter < max)
                        counter++;
                }
            }
        }
        max = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i] == 'b')
                max++;
            for (int j = 0; j < 4; j++) {
                if ((s[i] == 'b' && g[j] == 'b' && g[i] != 'b') && i != j && s[j] != 'b') {
                    if (counter < max)
                        counter++;
                }
            }
        }
        max = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i] == 'v')
                max++;
            for (int j = 0; j < 4; j++) {
                if ((s[i] == 'v' && g[j] == 'v' && g[i] != 'v') && i != j && s[j] != 'v') {
                    if (counter < max)
                        counter++;
                }
            }
        }
        return counter;
    }

    public static boolean check(char[] secret, char[] guess) {
        int c = checkCorrect(secret, guess);
        int n = checkNear(secret, guess);
        if (c == 4) {
            return true;
        } else {
            System.out.println("Total correct colors = " + c + " \nTotal partially correct = " + n + "");
            return false;
        }
    }

    public char[] guess() {
       String s = textM.getText();
        char[] guess = new char[4];
        if (guessing.length() != 4) {
            System.out.println("Invalid amount of characters. Try again");
        } else {
            for (int i = 0; i < 4; i++) {
                guess[i] = guessing.charAt(i);
            }
        }
        return guess;
    }
    }


