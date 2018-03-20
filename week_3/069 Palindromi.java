import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String textBackwards = "";
        int i=(text.length()-1);
        while (i>=0) {
            char letter = text.charAt(i);
            i--;
            textBackwards = textBackwards + letter;
        }
        if (text.equals(textBackwards)) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
