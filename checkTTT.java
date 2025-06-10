import java.util.*;
public class checkTTT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[][] TTTboard = new char[n][n];
        for (int i = 0; i<n;i++){
            for(int j=0; j<n;j++){
                TTTboard[i][j] = input.next().charAt(0);
            }
        }

        System.out.print(checkTTT(n,TTTboard));
    }

   public static boolean checkTTT(int n, char[][] TTTBoard) {
        int count =0;
    if (checkVX(n,TTTBoard)== true || checkHX(n,TTTBoard)== true || checkDX(n,TTTBoard)== true)
        count++;
    if (checkVO(n,TTTBoard)== true || checkHO(n,TTTBoard)== true || checkDO(n,TTTBoard)== true)
        count++;
    if (count ==1)
        return true;
    else return false;
   }

    public static boolean checkVX(int n, char[][] TTTBoard) {
        int counter = 0;
        int strike = 0;
        for (int c = n - 1; c >= 0; c--) {
            for (int r = n - 1; r >= 0; r--) {
                if (TTTBoard[r][c] != 'X') {
                    counter = 0;
                    strike++;
                    break;
                }
                else
                    counter++;
                if (counter == n)
                    return true;
                if (strike == n)
                    return false;
            }
        }
        return false;
    }
        public static boolean checkVO (int n, char[][] TTTBoard){
            int counter = 0;
            int strike = 0;
            for (int c = n - 1; c >= 0; c--) {
                for (int r = n - 1; r >= 0; r--) {
                    if (TTTBoard[r][c] != 'O') {
                        counter = 0;
                        strike++;
                        break;
                    } else
                        counter++;
                    if (counter == n)
                        return true;
                    if (strike == n)
                        return false;
                }
            }
            return false;
        }
    public static boolean checkHO (int n, char[][] TTTBoard){
        int counter = 0;
        int strike = 0;
        for (int r = n - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (TTTBoard[r][c] != 'O') {
                    counter = 0;
                    strike++;
                    break;
                } else
                    counter++;
                if (counter == n)
                    return true;
                if (strike == n)
                    return false;
            }
        }
        return false;
    }
    public static boolean checkHX (int n, char[][] TTTBoard){
        int counter = 0;
        int strike = 0;
        for (int r = n - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (TTTBoard[r][c] != 'X') {
                    counter = 0;
                    strike++;
                    break;
                } else
                    counter++;
                if (counter == n)
                    return true;
                if (strike == n)
                    return false;
            }
        }
        return false;
    }
    public static boolean checkDO (int n, char[][] TTTBoard){
        int counter = 0;
        int strike = 0;
        for (int r = n - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (r==c || r==n-1-c) {
                    if (TTTBoard[r][c] != 'O') {
                        counter = 0;
                        strike++;
                        break;
                    }
                    else
                        counter++;
                }
                if (counter == n)
                    return true;
                if (strike == n)
                    return false;
            }
        }
        return false;
    }
    public static boolean checkDX (int n, char[][] TTTBoard){
        int counter = 0;
        int strike = 0;
        for (int r = n - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (r==c || r==n-1-c) {
                    if (TTTBoard[r][c] != 'X') {
                        counter = 0;
                        strike++;
                        break;
                    }
                    else
                        counter++;
                }
                if (counter == n)
                    return true;
                if (strike == n)
                    return false;
            }
        }
        return false;
    }
    }



// LINK: https://www.hackerrank.com/contests/cs-ox-170/challenges/checkttt/submissions/code/1342959659