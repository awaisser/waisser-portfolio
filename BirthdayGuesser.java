import java.util.*;
public class BirthdayGuesser {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("I'm the DateEctive.🕵️‍♀️ Is your birth date in this set of numbers? \n " +
                "1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 \n if so, press 1, if not, press 0");
        int set1 = input.nextInt();
        System.out.println("Is your birth date in this set of numbers? \n " +
                "2, 3, 6, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31 \n if so, press 1, if not, press 0");
        int set2 = input.nextInt();
        System.out.println("Is your birth date in this set of numbers? \n " +
                "4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31 \n if so, press 1, if not, press 0");
        int set3 = input.nextInt();
        System.out.println("Is your birth date in this set of numbers? \n " +
                "8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31 \n if so, press 1, if not, press 0");
        int set4 = input.nextInt();
        System.out.println("Is your birth date in this set of numbers? \n " +
                "2, 3, 6, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31 \n if so, press 1, if not, press 0");
        int set5 = input.nextInt();

        int decimal = (set5*16) + (set4*8) + (set3*4) + (set2*2) + set1;
        System.out.printf("Your birthday is %d",decimal);
    }


}
/* Each set represents a digit of a number in binary notation in this way...
Set 5, Set 4, Set 3, Set 2, Set 1
If the user says yes, that Set is a 1, if not it is a 0.
*/