import java.util.*;
public class tripleChar {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String word = input.next();
        char ch = input.next().charAt(0);
        System.out.println(tripleChar(word,ch));
    }
    public static String tripleChar(String s, char c){
        for (int i = s.length()-1; i>=0;i--)
            if (s.charAt(i) == c) {
                String add = "" + c;
                s = s.substring(0, i) + add + add + s.substring(i);
            }
        return s;
    }
}
// LINK: https://www.hackerrank.com/contests/cs-ox-170/challenges/triplechar/submissions/code/1342991818