import java.util.*;
public class selectionSort {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        String[] strings = numbers.split(" ");
        int[] array = new int[strings.length];
        for(int i = 0; i< strings.length; i++)
        {
            array[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(Arrays.toString(selectionSort(array, 0)));

    }

    public static int[] selectionSort (int[] a, int startPt){
        int l = a.length;
        if (startPt==a.length-1)
            return a;
        for (int i =startPt; i<l;i++){
            int min = i;
            for (int j = i+1; j < l; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
    }
        return selectionSort(a, startPt+1);
    }}
