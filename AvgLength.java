import java.util.*;
public class AvgLength {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String x = input.next();
        System.out.println("Enter another word");
        String y = input.next();
        int d1=0;
        double avg =0;
        String [] s = {x,y};
        for(int q = 0; q<s.length;q++){
            double d = s[q].length();
            d1+= d;
        }
        avg = d1/s.length;
        System.out.println("Average is " + avg);
    }
}
