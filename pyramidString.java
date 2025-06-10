import java.util.*;
public class pyramidString {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Insert string");
        String word = input.next();
        char [][] result = new char[word.length()][word.length()];

        for (int row = 0; row<result.length;row++) {
            for(int col = 0; col < result[row].length;col++) {
                if (col<=row)
                    result[row][col] = word.charAt(col);
                else
                    result[row][col] = '*';
            }
        }
        }
    }
