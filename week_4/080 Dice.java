import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        
    }

    public int roll() {
        Random randomiser = new Random();
        return randomiser.nextInt(numberOfSides)+1;
    }
}
