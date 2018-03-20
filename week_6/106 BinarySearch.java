public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        int middle = (beginning + end) / 2;

        while (beginning <= end) {
            middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                //System.out.println("Value " + searchedValue + " in array");
                return true;
            }
            if (array[middle] > searchedValue) {
                end = middle - 1;
            }
            else if (array[middle] < searchedValue) {
                beginning = middle +1;
            }
            
    
            // restrict the search area 
        }
        //System.out.println("Value " + searchedValue + " is not in array");
        return false;
    }
}
