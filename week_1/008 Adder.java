
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        int result = firstNumber + secondNumber;
        System.out.println("");
        System.out.println("Sum of the numbers: " + result);
        //int firstNumber = Integer.parseInt(reader.nextline());
        //System.out.println(firstNumber);
        // Implement your program here. Remember to ask the input from user
    }
}
