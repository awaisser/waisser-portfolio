import java.util.*;
public class Border {
    public static void main (String args []) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word.");
        String M = input.next();
        System.out.println("Enter the border quantity.");
        int n = input.nextInt();

        if (n> 0 && n < M.length()) {
            if (M.substring(0,n).equals(M.substring(M.length()-n)))
                System.out.println ("Border exists");
                System.exit(0);
        }
           System.out.println("no border");
    }
}
