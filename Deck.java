import java.util.*;
public class Deck {
    public static void main (String args[]) {
        String[] suits = {"♠️", "❤️", "♦️", "♣️"};
        int[] number = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] deck = new String[52];

       int i = 0;
       for (int j = 0; j < 13; j++) {
           for (int k = 0; k < 4; k++) {
               deck [i] = (number[j] + " of " + suits[k]);
               i++;
           }
       }



        for(int q = 0; q < deck.length-1; q++) {
            int r = (int) (Math.random() * deck.length);
            String temp = deck[q];
            deck[q] = deck[r];
            deck[r]=temp;
            }

        System.out.println((deck[1] + " " + deck[2] + " " + deck[3] + " " + deck[4]));
    }
}
