
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int total = 0;
        System.out.print("Until what? ");
        int until = Integer.parseInt(reader.nextLine());   
        while (i <= until) {
            total = total + i;
            i++;
        }
        System.out.println("Sum is " + total);
    }
}
