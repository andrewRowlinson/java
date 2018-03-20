import java.util.Scanner;
import java.util.ArrayList;
        
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grade grade = new Grade();
        grade.createGrade(reader);
        grade.print();
}
    
    public static void readIn(Scanner reader) {
        Integer.parseInt(reader.nextLine());
    }
}




