import java.util.*;
public class week11 {
    public static void main (String[] args){
        int[] A = {4, 7, 9, 5, 11, 13, 14, 62, 1};
        int a = 1;
    }
    public static int linearSearch (int[]inputs, int item){
        for (int i =0; i< inputs.length;i++)
        {
            if (item==inputs[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch (int[]inputs, int item){
        int low = 0;
        int high = inputs.length -1;
        int mid = (high-low)/2;
        while (low<= high) {
            if (item<inputs[mid]) high = mid -1;
            else if (item > inputs[mid]) low = mid +1;
            else return mid;
        }
        return -1;
    }
}
