
public class Main {

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(0.5, 5, 5);
        //NightSky.printLine();
        //NightSky andy = new NightSky(1);
        //andy.printLine();
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
