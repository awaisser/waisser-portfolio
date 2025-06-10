import java.util.*;
public class SecondsToMinutes {
    public static void main (String args []){
        Scanner input = new Scanner (System.in);
        System.out.println("Input seconds");
        double seconds = input.nextDouble();

        double preMinutes = seconds/60;
        double minutes = Math.floor(preMinutes);
        double extraSeconds = seconds - minutes*60;
        double time = Math.floor(preMinutes) + extraSeconds;
        System.out.printf ("%.1f minutes and %.1f seconds", minutes, extraSeconds);
    }

}
