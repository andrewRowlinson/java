import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                Collections.reverse(words);
                break;
            }
            else words.add(word);
        }
        System.out.println("You typed the following words: ");        
        for (String help : words) {
            System.out.println(help);}
    }
}
