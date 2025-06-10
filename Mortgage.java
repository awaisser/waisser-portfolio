import java.util.Scanner;
public class Mortgage {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Current price");
        double ogPrice = input.nextDouble();
        System.out.println("Last month's price");
        double lmPrice = input.nextDouble();

        double mortgage = (ogPrice * 0.051)/12;
        double changeV = ogPrice - lmPrice;

        System.out.println("The house is "+ ogPrice +".");
        System.out.println("The change is "+ changeV +" since last month.");
        System.out.println("The estimated monthly mortgage is "+ mortgage +".");
    }
}
