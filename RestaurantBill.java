import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your bill amount?");
        double originalPrice = input.nextDouble();

        double tax = originalPrice * 0.07;
        double tip = tax * 0.20;
        double totalPrice = originalPrice + tax + tip;

        System.out.println("The tax for your bill is "+ tax +". ");
        System.out.println("The tip for your bill is "+ tip +".");
        System.out.println("Your total price for today is "+ totalPrice +".");
    }
}
