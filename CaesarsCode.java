import java.util.*;
public class CaesarsCode {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please type a letter.");
        char firstLetter = input.next().charAt(0);
        int magicN = firstLetter;
        if (firstLetter >= 'A' && firstLetter <= 'Z') {
            magicN = firstLetter - 65;
        }
        else if (firstLetter >= 'a' && firstLetter <= 'z') {
            magicN = firstLetter -97;
        }
        else {
            System.out.print("Not a letter. :(");
        }

        System.out.println("What is your index number?");
        int index = input.nextInt();
        int index2;
        if (index >= 26 || index <= 26) {
            index2 = index % 26;
        }
        else {
            index2 = index;
        }

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int code;
        code = (int)magicN + index2;
        if (code < 0) {
            code = code+26;
            System.out.println(alphabet.charAt(code));
        }
        else if (code >25) {
            code = code-26;
            System.out.println(alphabet.charAt(code));
        }
        else {
            System.out.println(alphabet.charAt(code));
        }

    }
    }
