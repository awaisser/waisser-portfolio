import java.util.*;
public class sumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] array = new int[n];
        for (int q = 0; q < n; q++) {
            array[q] = input.nextInt();
        }
        System.out.println(Arrays.toString(sum(n, m, array)).replace("[", "").replace("]", "").replace(",", ""));
    }

    public static int[] sum(int n, int m, int[] array) {
        int[] result = new int[0];
        if (n< 0) {
            return new int[]{-1, -1};
        }
        for (int i = 2; i <= n; i++) {
            if (array[n - 1] + array[n - i] == m) {
                result = new int[]{n - i, n - 1};
                return result;
            }
        }
        return sum(n - 1, m, array);
    }
}

// LINK: https://www.hackerrank.com/contests/cs-ox-170/challenges/sumofpairs/submissions/code/1342991720