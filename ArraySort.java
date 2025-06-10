import java.util.Arrays;

public class ArraySort {
    private int[] array = new int[1];
    private int lengthy;

    public void ArraySort(int[] ba) {
        array=ba;
        lengthy=ba.length;
    }
    public int search (int target){
        int k=0;
        for (int i=0; i<lengthy;i++){
            if (target == array[i])
                k++;
        }
        if (k>0)
            return k;
        else
        return -1;
    }
    public int maximum(){
        if (lengthy>0){
                int n = lengthy;
                int maxPos = 0;
                for (int i = n; i >= 0; i--) {
                    maxPos = i;
                    for (int j = i-1; j >= 0; j--) {
                        if (array[j] > array[maxPos]) {
                            maxPos = j;
                        }
                    }
                }
                return maxPos;
            }
        else
            return Integer.MIN_VALUE;
    }
    public int minimum(){
        if (lengthy>0){
            int n = lengthy;
            int minPos = 0;
            for (int i = 0; i <n; i++) {
                minPos = i;
                for (int j = i+1; j < n; j++) {
                    if (array[j] < array[minPos]) {
                        minPos = j;
                    }
                }
            }
            return minPos;
        }
        else
            return Integer.MAX_VALUE;
    }
    public int getElement (int index){
        if (index<lengthy)
            return array[index];
        else {
            System.out.print("IndexOutOfBoundsException");
            return Integer.MIN_VALUE;
        }
    }
    public void setElement (int index, int value){
        if (index<lengthy)
        array[index] = value;
        else
            System.out.print("IndexOutOfBoundsException");
    }
    public static void exch (int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    public void sort() {
            int n = array.length;
            for (int i = 0; i < n; i++) {
                int minPos = i;
                for (int j = i+1; j < n; j++) {
                    if (array[j] < array[minPos]) {
                        minPos = j;
                    }
                }
                exch(array,i,minPos);
            }
        }
     public void addElement(int value){
        if (lengthy>= array.length && array.length>0) {
            int newArray[] = new int [array.length*2];
            for (int i =0; i<array.length;i++){
                newArray[i]=array[i];
            }
            newArray[array.length] = value;
            array = newArray;
            lengthy++;
        }
        else {
            array[lengthy] = value;
            lengthy++;
        }
        }
     public void printArray() {
        for (int i = 0; i<lengthy;i++)
         System.out.print(array[i] + " ");
     }
     public void delete(int value){
         for (int i = 0; i < array.length - 1; i++) {
            if (array[i]== value){
                for (int q = i; q < array.length - 1; q++)
                    array[q] = array[q + 1];
            }
         }
         lengthy--;
     }
    }
