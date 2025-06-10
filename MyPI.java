import java.util.* ;
public class MyPI {
    public static void main (String args[]) {
        Random rand = new Random();
        double numHits = 0;
        double totalnum = 0;
        for (int n =0; n<500000; n++){
            double x = rand.nextDouble ();
            double y = rand.nextDouble();
            totalnum++;
            if (Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) <= 1) {
                numHits++;
            }
        }
        double pi = 4.0 * (numHits/totalnum);
        System.out.println(pi);
    }
}
