public class Main {
    public static void main(String[] args) {
        // Create counter
        Counter counter1 = new Counter(2,true);
        System.out.println(counter1.toString()); 
        counter1.decrease(4);
        System.out.println(counter1.toString()); 
    }
}
