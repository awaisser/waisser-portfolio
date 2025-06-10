import java.util.*;
public class TTT {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert n");
        int n = input.nextInt();
        char [][] board = new char[n][n];
        Random rand = new Random();

        if (n%2 != 0){
        for (int xOdd =0; xOdd<((n*n/2)+1);){
                int randomR = rand.nextInt(0,n);
                int randomC = rand.nextInt(0,n);
                if (board[randomR][randomC] != 'x' && board[randomR][randomC] != 'o') {
                    board[randomR][randomC] = 'x';
                    xOdd++;
                }
            }
            for (int oOdd =0; oOdd<((n*n/2));){
                int randomR = rand.nextInt(0,n);
                int randomC = rand.nextInt(0,n);
                if (board[randomR][randomC] != 'x' && board[randomR][randomC] != 'o') {
                    board[randomR][randomC] = 'o';
                    oOdd++;
                }
            }
        }
        else {
            for (int xEven =0; xEven<(n*n/2);){
                int randomR = rand.nextInt(0,n);
                int randomC = rand.nextInt(0,n);
                if (board[randomR][randomC] != 'x' && board[randomR][randomC] != 'o') {
                    board[randomR][randomC] = 'x';
                    xEven++;
                }
            }
            for (int oEven =0; oEven<((n*n/2));){
                int randomR = rand.nextInt(0,n);
                int randomC = rand.nextInt(0,n);
                if (board[randomR][randomC] != 'x' && board[randomR][randomC] != 'o') {
                    board[randomR][randomC] = 'o';
                    oEven++;
                }
            }
    }
        System.out.println(Arrays.deepToString(board).replace("], ", "]\n"));
    }
}
