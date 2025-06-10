import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert n value");
        int n = input.nextInt();
        int nsafe = n;
        int column = 1;
        int[][] triangle = new int[n+1][n];
        for(int l=0; l<=n;l++) {
            triangle[l][0] = 1;
        }
        int n3=1;
        for (int row =0;row<=nsafe;row++) {
            for (int col = 0; col < nsafe; col++) {
                if (row > col)
                    for (; n >= 0; n--) {
                        double n2;
                        for (n2 = 1; n2 <= n; n2++)
                            triangle[n][(int) n2] = (int) (n3 * ((n - n2) / n2));
                        n3 = (int) (n3 * ((n - n2) / n2));
                    }
            }
        }
        for(int l=0;l<=nsafe;l++) {
            triangle[l][l]=1;
        }



        for(int p = 0; p< triangle.length; p++)
            System.out.println(Arrays.toString(triangle[p]));
    }
}