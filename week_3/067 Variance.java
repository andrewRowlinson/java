import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int number : list) {
            total += number;
        }
        return total;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = sum(list)/(list.size()*1.0);
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double var1 = 0;
        double avg1 = average(list);
        int n = list.size();
        for (int number : list) {
            var1 += Math.pow(number - avg1,2);         
        }
        return (var1/(n-1));
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
