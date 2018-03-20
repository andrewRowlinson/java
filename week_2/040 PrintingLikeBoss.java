public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int j=0;
        while (j < amount) {
            System.out.print("*");
            j++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int i=0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i=0;
        int stars=0;
        int white=0;
        while (i<size) {
            i++;
            white = (size - i);
            stars = (size - white);
            printWhitespaces(white);
            printStars(stars);
        }
    }

    public static void xmasTree(int height) {
        int i=1;
        int white=0;
        while (i<=height) {
            white = (height - i);
            printWhitespaces(white);
            printStars(2*i-1);
            i++;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3); 
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
