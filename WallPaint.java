import java.util.*;
public class WallPaint {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your wall's height in feet");
        double height = input.nextDouble();
        System.out.println("What is your wall's width in feet");
        double width = input.nextDouble();

        double area = height * width;
        double gallons = area/350.0;
        int cans = (int) Math.ceil(gallons);

        System.out.println ("You will need "+ cans +" can(s) to paint this wall.");
    }
}
