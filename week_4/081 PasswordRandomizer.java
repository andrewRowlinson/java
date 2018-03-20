import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int numberCharacters;

    public PasswordRandomizer(int length) {
        this.numberCharacters = length;
    }

    public String createPassword() {
        int i = 0;
        Random randomiser = new Random();
        String selection = "abcdefghijklmnopqrstuvwxyz";
        String password="";
        while (i < this.numberCharacters) {
            int lookup = (randomiser.nextInt(26));
            char letter = selection.charAt(lookup);
            password += letter;
            i++;
        }
        return password;
    }
}
