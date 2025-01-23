package src;
import java.util.Scanner;

public class reviewPart1 {
    public static void main (String args[]) {
        System.out.println("Enter a grade from 0-100.");

        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();

        if (score < 60.0) {
            System.out.println("F");
        }
        else if (score < 70.0) {
            System.out.println("D");
        }
        else if (score < 80.0) {
            System.out.println("C");
        }
        else if (score < 90.0) {
            System.out.println("B");
        }
        else if (score <= 100.0) {
            System.out.println("A");
        }
        else {
            System.out.println("Invalid input");
        }

    }
}