
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = drawNumber();
        int i=0;
        while (true) {
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            i++;
            if (guess == number) {
                break;}
                        if (guess < number) {
                            System.out.println("The number is greater, guesses made: " + i);}
                        else {
                            System.out.println("The number is lesser, guesses made: " + i);}
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
