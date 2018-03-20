
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("Type your age: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.print("Type your name: ");
        String nameTwo = reader.nextLine();
        System.out.print("Type your age: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        int sumAge = (numberOne + numberTwo);
        System.out.println("");
        System.out.println(name + " and " + nameTwo + " are " + sumAge + " years old in total.");
    }
}
