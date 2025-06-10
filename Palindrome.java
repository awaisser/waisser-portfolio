import java.util.*;
public class Palindrome {
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word to see if it is a palindrome.");
        String s = input.next();
        int q = 0;
        if (s.isEmpty()) {
            System.out.println("String is empty, try again.");
        }
        else {
            for (int i = 0; i < s.length() / 2; i++) {
                if(s.charAt(i)!= s.charAt(s.length()-1-i)) {
                    System.out.println("False, not a palindrome.");
                    q = q+1;
                    break;
                }
                }
            }
            if (q == 0) {
                System.out.println("True.");
        }
        }
        }


