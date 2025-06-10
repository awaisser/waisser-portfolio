import java.util.*;
public class FaToCe {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Insert Fahrenheit");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32.0)* (5.0/9.0);

        System.out.printf(" %.2f °F is %.2f °C ", fahrenheit, celsius);
    }
}
/*
ANSWERS FOR QUESTION 1
a. 32
b. H
c. hannah.substring (15)
d. 4 characters long, "h se"

 */