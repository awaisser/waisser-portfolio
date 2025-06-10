import java.util.*;
public class InitialFinder {
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your first name?");
        String firstName = input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();
        char initialFirst = firstName.charAt(0);
        char initialLast = lastName.charAt(0);
        System.out.printf ("Your initials are %c.%c.", initialFirst, initialLast);
    }
}
