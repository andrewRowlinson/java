
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        int remainder4 = year %4;
        int remainder100 = year % 100;
        int remainder400 = year % 400;
        if (remainder100 == 0 && remainder400 == 0) {
            System.out.println("The year is a leap year.");}
        else if (remainder4 == 0 && remainder100 != 0) {
            System.out.println("The year is a leap year.");}
        else {
            System.out.println("The year is not a leap year.");}
    }
}
