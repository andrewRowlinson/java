
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number: ");
        int number = 0;
        int upTo = Integer.parseInt(reader.nextLine());
        while (number < upTo) {
            number++;
            System.out.println(number);
        }
    }
}
