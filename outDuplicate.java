import java.util.Arrays;
import java.util.Scanner;

public class outDuplicate {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        String[] strings = numbers.split(" ");
        int[] array = new int[strings.length];
        for(int i = 0; i< strings.length; i++)
        {
            array[i] = Integer.parseInt(strings[i]);
        }
        int length = array.length;
        length = duplicateRemover(array, length);
        for (int i=0; i<length; i++)
            System.out.print(array[i]+" ");
    }
     public static int duplicateRemover (int arr[], int n){
         if (n==0 || n==1){
             return n;
         }
         int[] temp = new int[n];
         int j = 0;
         for (int i=0; i<n-1; i++){
             if (arr[i] != arr[i+1]){
                 temp[j++] = arr[i];
             }
         }
         temp[j++] = arr[n-1];
         for (int i=0; i<j; i++){
             arr[i] = temp[i];
         }
         return j;
     }
}

