import java.util.*;
public class ReplaceChar {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please type a string.");
        String firstInput = input.next();
        System.out.println("What is your index?");
        int index = input.nextInt();
        System.out.println("What char are you replacing it with?");
        char replacer = input.next().charAt(0);

        System.out.println(firstInput.substring(0,index) + replacer + firstInput.substring(index+1));

    }
}
// You cannot replace because that would not take into account the index that was the input.
