import java.util.*;
public class outDupli {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        String[] strings = numbers.split(" ");
        int[] array = new int[strings.length];
        for(int i = 0; i< strings.length; i++)
        {
            array[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(withIntOutDupli(array, 0));

    }
    public static int [] withIntOutDupli(int[]a, int start){
     a = selectionSort(a,0);
        int [] output = new int[a.length];
        int l =a.length;

        int o =0;
        for (int i = 1; i<l;i++){
            if (start+i<l){
                if (a[start] == a[start+i])
                    continue;
                else{
                    output[o] = a[start];
                    o++;
                }
            }
        }
        if (start == a.length)
            return output;
       return withIntOutDupli(a, start+1);
    }
    public static int[] selectionSort (int[]e, int startPt) {
        int l = e.length;
        if (startPt == e.length - 1)
            return e;
        for (int i = startPt; i < l; i++) {
            int min = i;
            for (int j = i + 1; j < l; j++) {
                if (e[j] < e[min]) {
                    min = j;
                }
                int temp = e[i];
                e[i] = e[min];
                e[min] = temp;
            }
        }
        return selectionSort(e, startPt+1);
    }
}

