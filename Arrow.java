import java.util.Scanner;
public class Arrow {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first integer");
        int iOne = input.nextInt();
        System.out.println("Enter second integer");
        int iTwo = input.nextInt();
        System.out.printf("   %d" , iOne);
        System.out.printf("\n%d%d%d%d%d", iTwo, iTwo, iTwo, iOne, iOne);
        System.out.printf("\n%d%d%d%d%d%d", iTwo, iTwo, iTwo, iOne, iOne, iOne);
        System.out.printf("\n%d%d%d%d%d", iTwo, iTwo, iTwo, iOne, iOne);
        System.out.printf("\n   %d", iOne);
    }

}
