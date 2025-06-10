import java.util.*;
public class FibOrNot {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fib(n));
    }
    public static boolean fib (int n){
        int first =0;
        int second =1;
        int third =0;
        while (third<n){
            third = first + second;
            first = second;
            second = third;
        }
        if (third == n)
            return true;
        else
            return false;
    }
}
