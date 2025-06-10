import java.util.*;
public class MagicTrick {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("First digit");
        int inputOne = input.nextInt();
        System.out.println("Second digit");
        int inputTwo = input.nextInt();
        System.out.println("Third digit");
        int inputThree = input.nextInt();

        int largest = Math.max(Math.max(inputOne, inputTwo), inputThree);
        int smallest = Math.min(Math.min(inputOne, inputTwo), inputThree);
        int sum = Math.addExact(Math.addExact(inputOne, inputTwo), inputThree);
        int middle = Math.subtractExact(Math.subtractExact(sum,largest), smallest);
        int outputOne = (largest*100) + (middle*10) + smallest;

        System.out.printf("The output is number %d", outputOne);

        int inverseOne = (smallest*100) + (middle*10) + largest;
        int differenceOne = outputOne - inverseOne;

        System.out.printf("\n %d - %d equals %d", outputOne, inverseOne, differenceOne);
        double hundreds = differenceOne/100;
        int largestTwo = (int) Math.floor(hundreds);
        double tens = (differenceOne - (largestTwo*100))/10;
        int middleTwo = (int) Math.floor(tens);
        int lowestTwo = differenceOne- (largestTwo*100) - middleTwo*10;

        int inverseTwo = (lowestTwo*100) + (middleTwo*10) + largestTwo;

        int finalSum = differenceOne + inverseTwo;

        System.out.printf("\n %d + %d equals %d", differenceOne, inverseTwo, finalSum);

    }
}
