import java.util.*;
public class PrimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = Integer.parseInt(input.next());
        System.out.println("Enter number of columns");
        int columns = Integer.parseInt(input.next());
        System.out.println(Arrays.deepToString((printTableOfPrimes(rows, columns))));
    }

    public static boolean isPrime(int num) {
        boolean prime = true;
        if (num <= 1) {
            prime = false;
            return prime;
        }
        else {
            for (int i = 2; i <= num/2; ++i) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            return prime;
        }
    }

    public static boolean[][] whichArePrime(int[][] table, int r, int c) {
        boolean[][] primeTable = new boolean[r][c];
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                primeTable[row][col] = isPrime(table[row][col]);
            }
        }
        return primeTable;
    }

    public static String[][] printTableOfPrimes(int r, int c) {
        int[][] startTable = new int[r][c];
        int i = 1;
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                startTable[row][col] = (i);
                i++;
            }
        }
        boolean[][] primeValues = whichArePrime(startTable, r, c);
        String[][] lastTable = new String[r][c];
        String asterisk = "*";
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                lastTable[row][col] = String.valueOf(startTable[row][col]);
                if (primeValues[row][col] == true)
                    lastTable[row][col] = lastTable[row][col] + asterisk;
            }
        }
        return lastTable;
    }
}
