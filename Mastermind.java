import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Mastermind  {


    public static void main(String[] args) {
        MMGUI hi = new MMGUI();
        Scanner input = new Scanner(System.in);
        char[] colors = {'r', 'o', 'y', 'g', 'b', 'v'};
        char[] secret = secretGen(colors);
        game(8, secret);
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

    public static char[] guess() {
        Scanner input = new Scanner(System.in);
        char[] guess = new char[4];
        String guessing = input.next();
        if (guessing.length() != 4) {
            System.out.println("Invalid amount of characters. Try again");
        } else {
            for (int i = 0; i < 4; i++) {
                guess[i] = guessing.charAt(i);
            }
        }
        return guess;
    }

    public static void game(int lives, char[] secret) {
        Scanner input = new Scanner(System.in);
        char[] colors = {'r', 'o', 'y', 'g', 'b', 'v'};
            while (lives > 0) {
                System.out.println("Something 2");
                char[] guess = guess();
                boolean c = check(secret, guess);
                        if (c == true) {
                            System.out.println("Congratulations! You Win! Press 0 to exit or 1 to restart.");
                            int e = input.nextInt();
                            if (e == 0)
                                System.exit(0);
                            else if (e == 1) {
                                secret = secretGen(colors);
                                System.out.println("New Game.");
                                game(8, secret);
                            } else {
                                System.out.println("Invalid. Press 0 to exit or 1 to restart.");
                                e = input.nextInt();

                            }


                        } else {
                            lives--;
                            System.out.println("You have " + lives + " lives,");
                        }
                    }
        if (lives == 0) {
            String sst = Arrays.toString(secret);
            System.out.println("You have 0 lives. You lost. Code was " + sst + ". Press 0 to exit or 1 to restart.");
            int e = input.nextInt();
            if (e == 0)
                System.exit(0);
            else if (e == 1) {
                secret = secretGen(colors);
                System.out.println("New Game.");
                game(8, secret);
            } else {
                System.out.println("Invalid. Press 0 to exit or 1 to restart.");
                e = input.nextInt();
            }
        }
    }
}
