import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int total = 0;
        int i = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;}
            total += number;
            i++;
            if (number % 2 == 0) {
                even++;}
            else {
                odd++;}
        }
    System.out.println("Thank you and see you later!");
    System.out.println("The sum is " + total);
    System.out.println("How many numbers: " + i);
    double mean = (double)total/i;
    System.out.println("Average: " + mean);
    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);
    }
}
