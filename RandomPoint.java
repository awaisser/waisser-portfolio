import java.util.*;
public class RandomPoint {
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.println("X coordinate for point A");
        double XcoordA = input.nextDouble();
        System.out.println("Y coordinate for point A");
        double YcoordA = input.nextDouble();
        System.out.println("X coordinate for point B");
        double XcoordB = input.nextDouble();
        System.out.println("Y coordinate for point B");
        double YcoordB = input.nextDouble();

        double x = (Math.min(XcoordA, XcoordB)* Math.random() * Math.abs(XcoordB-XcoordA));
        double y = (Math.min(YcoordA, YcoordB)* Math.random() * Math.abs(YcoordB-YcoordA));
        System.out.printf("The random point coordinates might be: %.1f and %.1f", x, y);

    }
}
