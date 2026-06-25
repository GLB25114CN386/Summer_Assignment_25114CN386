package Day26;
import java.util.*;
import java.util.Random;
public class Q101 {
    public static void input(Scanner sc, int x) {
        System.out.println("Guess a number between 1 and 100");
        int n = sc.nextInt();
        if (n < x) {
            System.out.println("Low");
            try1(sc, x);
        } else if (n > x) {
            System.out.println("High");
            try1(sc, x);
        } else {
            System.out.println("Correct");
        }
    }
    public static void try1(Scanner sc, int x) {
        System.out.println("Try Again Y/N");
        char c = sc.next().charAt(0);
        if (c == 'Y' || c == 'y') {
            input(sc, x);
        } else if (c == 'N' || c == 'n') {
            System.out.println("Correct Number = " + x);
        } else {
            System.out.println("Invalid Input");
            try1(sc, x);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(101);
        input(sc, x);
    }
}