import java.util.*;

public class A6Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] myList = new int[n];
        for (int i = 0; i < n; i++) {
            myList[i] = input.nextInt();
        }
        int counter1 = 1;
        int counter2 = 0;
        for (int j = 0; j < myList.length - 1; j++) {
            if (myList[j + 1] != myList[j])
                counter1++;
            else
                counter2++;
        }
        for (int w = 0; w < counter2; w++) {
            for (int r = 0; r < myList.length - 1; r++) {
                if (myList[r + 1] == myList[r]) {
                    for (int k = r; k < myList.length - 1; k++)
                        myList[k] = myList[k + 1];
                }
            }
        }

        System.out.print(counter1 + " ");
        for (int l = 0; l < myList.length; l++) {
            if (l < myList.length - 1  && myList[l + 1] == myList[l]) {
                System.out.print(myList[l] + " ");
                break;
            }
            else
                System.out.print(myList[l] + " ");
        }
    }
}

//  LINK FOR HACKER RANK
//  https://www.hackerrank.com/contests/cs-ox-170/challenges/rmdupinsortedarray/submissions/code/1342408389