import java.util.ArrayList;
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        Commands command = new Commands();
        command.menu(reader);
    //command.add(new Bird("Teal","Common"));
    //command.add(new Bird("Robbin","Christmas Bird"));
    //command.add(new Bird("Numchuck","Ninja Bird"));
    //command.observe("Teal");
    //command.observe("Robbin");
    //command.observe("Robbin");
    //command.observe("Numchuck");
    //command.statistics();
    //command.show("Teal");
    //command.show("Numchuck");
    }

}
