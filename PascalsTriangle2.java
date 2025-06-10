import java.util.*;
public class PascalsTriangle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert n value");
        int n = input.nextInt();
        int[][] tri = new int [n][n];
        for (int line=0;line<n;line++){
            for (int i=0;i<=line;i++){
                if (line== i || i ==0)
                    tri[line][i] =1;
                else
                    tri[line][i] = tri[line-1][i-1] + tri[line-1][i];
                System.out.print(tri[line][i]);
            }
            System.out.println("");
            }
        }

    }

