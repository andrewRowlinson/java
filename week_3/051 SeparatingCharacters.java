
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = name.length();
        int j = 0;
        while (j <= i - 1) {
            System.out.println((j+1)+". character: " + name.charAt(j));
            j++;
        }
    }
}
