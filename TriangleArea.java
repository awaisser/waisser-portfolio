import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        triangle1.setBase(scnr.nextDouble());
        triangle1.setHeight(scnr.nextDouble());
        triangle2.setBase(scnr.nextDouble());
        triangle2.setHeight(scnr.nextDouble());
        // TODO: Determine larger triangle (use getArea())
        double area1 = triangle1.getArea();
        double area2 = triangle2.getArea();
        if (area1>area2)
            triangle1.printInfo();
        else if (area2>area1)
            triangle2.printInfo();

        // TODO: Output larger triangle's info (use printInfo())
    }
}