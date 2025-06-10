import java.util.*;
public class HamDist {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int x = input.nextInt();
        System.out.println("Enter another number");
        int y = input.nextInt();
        int [] binaryX = new int [1024];
        int [] binaryY = new int [1024];
        int i = 0;
        int iy=0;
        while (x >0) {
           int rem = x%2;
            binaryX [i] = (rem);
            i++;
            x /= 2;
       }
        while (y >0) {
            int remy = y%2;
            binaryY [iy] = (remy);
            iy++;
            y /= 2;
        }
        int[] binaryXB = new int[1024];
        int j = 1024;
        for (int ixb = 0; ixb < 1024; ixb++) {
            binaryXB[j - 1] = binaryX[ixb];
            j = j - 1;
            if(j==1)
                break;
        }
        int [] binaryYB = new int [1024];
        int jy = 1024;
        for (int iyb = 0; iyb < 1024; iyb++) {
            binaryYB[jy - 1] = binaryY[iyb];
            jy = jy - 1;
            if(jy==1)
                break;
        }
        int ham = 0;
        for (int k=0; k<(binaryXB.length); k++) {
            if (binaryXB [k] != binaryYB [k]) {
                    ham++;
            }
        }
        System.out.printf("Hamming distance is %d", ham);
       }
    }

