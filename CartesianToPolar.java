import java.util.*;
public class CartesianToPolar {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Type X coordinate.");
        double x = input.nextDouble();
        System.out.println("Enter Y coordinate.");
        double y = input.nextDouble();

        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double theta = Math.toDegrees(Math.atan(y/x));
        if (y>=0 && x<0) {
            theta = 90 - theta;
        }
        else if (y<0 && x<0) {
            theta = -90 - theta;
        }
        System.out.printf("r = %f, θ = %f °", r, theta);
    }
}
