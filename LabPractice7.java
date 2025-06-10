import java.util.*;
public class LabPractice7 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a String");
        String userInput = input.next();
        System.out.println("Input an integer");
        int userNumber = input.nextInt();

        String reverseI = createPalindrome(userInput);
        System.out.println(userInput + reverseI);

        boolean perfect = isPerfect(userNumber);
        System.out.println(perfect);
    }
public static String createPalindrome (String s) {
    return s.length()>0?
            createPalindrome(s.substring(1))+ s.charAt(0):"";
}
public static boolean isPerfect (int aPosInt) {
    int sum = 0;
    for (int i = 1; i < aPosInt; i++) {
        if (aPosInt % i == 0) {
            sum = sum + i;
        }
    }
    return sum == aPosInt;
}
}
