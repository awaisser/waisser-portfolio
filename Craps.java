import java.util.*;
public class Craps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("type 0 to roll the dice");
        int sup0 = input.nextInt();
        if (sup0 == 0) {
            int random = (int) (Math.random() * 12 + 1);
            int sup0a = 0;
            int random2 = 0;
            if (random == 7 || random == 11) {
                System.out.printf("\nCongrats, you got a %d and won.", random);
            } else if (random == 2 || random == 3 || random == 12) {
                System.out.printf("\nSorry, you got a %d and lost.", random);
            } else {
                System.out.printf("\nYou got a %d.", random);
                System.out.println("\ntype 0 to roll again");
                sup0a = input.nextInt();
            }
            int res;
            if (sup0a == 0)
                for (res = 0; res < 1; ) {
                    random2 = (int) (Math.random() * 12 + 1);
                    if (random2 == random) {
                        System.out.printf("\nCongrats, you got a %d and won.", random);
                        break;
                    }
                    else if (random2 ==7) {
                        System.out.println("\nSorry, you got a 7 and lost.");
                        break;
                    }
                    else
                    System.out.printf("\nYou got a %d, roll again.", random2);
                }
        }
    }
}
