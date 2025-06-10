import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
public class searchMin {
    public static void main(String[] args) throws IOException {
        //there is nothing to be done here
        //Don't modify the codes below.
        //All the code here is used for test usage.
        Scanner br = new Scanner(System.in);
        int n = br.nextInt(); //total number of items
        int m = br.nextInt(); // the searching item
        int[] numbers = new int[n];
        // Read input array numbers
        for (int i = 0; i < n; i++) {
            numbers[i] = br.nextInt();
        }
        int high = numbers.length - 1;
        int answer = searchMinIndex(numbers, m, high);
        PrintWriter out = new PrintWriter(System.out);
        out.print(answer);
        out.close();
    }

    public static int searchMinIndex(int[] A, int m, int high) {
        int low = 0;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (m < A[mid])
                high = mid - 1;
            else if (m > A[mid])
                low = mid + 1;
            else {
                if (searchMinIndex(A,m,mid-1) == -1)
                    return mid;
                else
                    high =mid;
            }
        }
        return -1;
    }
}

//LINK: https://www.hackerrank.com/contests/cs-ox-170/challenges/searchminindex/submissions/code/1343302545
