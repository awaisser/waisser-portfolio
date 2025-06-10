import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int random = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("It's time! Guess the number and you may win thousands!");
        int guess = input.nextInt();

        while (guess != random) {
            double tens = ((double) random / 10.0);
            int winTens = (int) Math.floor(tens);
            int winOnes = random - (winTens * 10);
            double guessTens = (guess / 10.0);
            int guessTensFinal = (int) Math.floor(guessTens);
            int guessOnes = guess - (guessTensFinal * 10);

            if (guess < random) {
                System.out.println("BOO 🍅🍅🍅🍅 Too low :(");
                System.out.println("It's time! Guess the number and you may win thousands!");
                guess = input.nextInt();
            } else if (guess > random) {
                System.out.println("BOO 🍅🍅🍅🍅 Too high :(");
                System.out.println("It's time! Guess the number and you may win thousands!");
                guess = input.nextInt();
            }

        }
        System.out.println("Congrats! You won $10,000!!!!! ");
    }
}

