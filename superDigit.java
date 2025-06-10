import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
    public class superDigit {
        public static void main(String[] args) throws IOException {
            //there is nothing to be done here
            //Don't modify the codes below.
            //All the code here is used for test usage.
            // Read input integer num
            Scanner br = new Scanner(System.in);
            int num = br.nextInt();
            //calculate the superDigit of num and assign the result to answer.
            int answer = superDigit(num);
            PrintWriter out = new PrintWriter(System.out);
            out.print(answer); // print the answer
            out.close();
        }
        public static int superDigit(int n){
            String s = "0";
            if (n>=10) {
                s = String.valueOf(n);
                int a =0;
                for (int i = s.length() - 1; i >= 0; i--) {
                    a += Integer.parseInt(String.valueOf(s.charAt(i)));
                }
                if (a>=10) {
                    return superDigit(a);
                }
                else
                    return a;
            }
            else
            return n;
        }
    }

//LINK: https://www.hackerrank.com/contests/cs-ox-170/challenges/superdigit-3/submissions/code/1343302807