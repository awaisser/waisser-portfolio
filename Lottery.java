import java.util.*;
public class Lottery {
    public static void main (String [] args) {
        Random rand = new Random();
        int random = rand.nextInt (100);

        Scanner input = new Scanner (System.in);
        System.out.println("It's time! Guess the number and you may win thousands!");
        int guess = input.nextInt();

        double tens = ((double)random/10.0);
        int winTens = (int) Math.floor(tens);
        int winOnes = random - (winTens*10);

        double guessTens = (guess/10.0);
        int guessTensFinal = (int) Math.floor(guessTens);
        int guessOnes = guess - (guessTensFinal*10);

        if (guess == random) {
            System.out.println("Congrats, you won $10,000!!");
        }
        else if (guess == ((winOnes*10)+winTens)) {
            System.out.println("Congrats, you won $3,000.");
        }
        else if ((winTens == guessTensFinal || winOnes == guessTensFinal) ^ (winOnes == guessOnes || winTens == guessOnes)){
            System.out.println("Meh, you won $1,000.");
        }
        else
            System.out.println("BOO 🍅🍅🍅🍅 you win $0.");
    }
}
