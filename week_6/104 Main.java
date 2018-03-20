import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {6, 5, -7, -8, 8, 1, 7, 11, 7, -5, 7};  
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
        System.out.println(Arrays.toString(values));
        sort(values);
        System.out.println(Arrays.toString(values));
        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));
        System.out.println("---");
        sort(values);
    }
    
    public static int smallest(int[] array) {
        int i = array[0];
        for (int j : array) {
            if (j < i) {
                i = j;
            }
        }
        return i;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i=0; i < array.length; i++) {
            int indexNextSmallest = indexOfTheSmallestStartingFrom(array,i);
            swap(array, i, indexNextSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static void swap(int[] array, int index1, int index2) {
            int swap1 = array[index1];
            int swap2 = array[index2];
            array[index1] = swap2;
            array[index2] = swap1;
       // for (int i : array) {
         //   if (i==index1) {
           //     array[i] = array[index2];
            //}
            //else if (i==index2) {
              //  array[i] = array[index1];
           // }
           // else {
            //}
        //}
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int i = array[index];
        int k = index;
        for (int j = (index+1); j < array.length; j++) {
            if (array[j] < i) {
                i = array[j];
                k = j;
            }
        }
        return k;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int i = array[0];
        int k = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] < i) {
                i = array[j];
                k = j;
            }
        }
        return k;
    }
}
