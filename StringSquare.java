import java.util.*;
public class StringSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert string");
        String word = input.next();
        char matrix [][] = new char[word.length()][word.length()];

        for (int l = 0; l < word.length(); l++) {
            matrix [0][l] = word.charAt(l);
        }
        for (int row = 1; row < word.length() - 1; row++) {
            for (int col = 0; col < word.length(); col++) {
                if (col == 0)
                    matrix[row][col] = word.charAt(row);
                else if (col == word.length() - 1)
                    matrix[row][col] = word.charAt(word.length() - 1 - row);
                else
                    matrix[row][col] = '*';
            }
        }
        for (int m = word.length() - 1; m>=0; m--) {
            matrix[word.length() - 1][m] = word.charAt(word.length()-1-m);
        }
        for(int p = 0; p< matrix.length; p++)
        System.out.println(Arrays.toString(matrix[p]));
    }
}
