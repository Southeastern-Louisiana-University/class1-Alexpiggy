package src;

import java.util.Scanner;

public class loopsReview {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // initialize variables
        double grade = 0;
        double sum = 0;
        double count = 0;
        double average = 0;

        while (grade >= 0) { // if negative then exit
            System.out.println("Please input a grade from 0 to 110 (negative number to terminate)");
            grade = input.nextDouble();
            if (grade > 110) { // don't go above 110
                System.out.println("Invalid! Must be between 0 and 110.");
            }
            else { // calculate running average
                sum += grade;
                count++;
                average = sum/count;

                // rest of the code is in this else so you aren't repeatedly told the same average & grade with invalid inputs
                if (grade >= 0) {// prevents adding the exit to the average
                    System.out.print("The average score is " + average + ", with a grade of "); // print average

                    if (average < 60.0) { // print grade, copy & paste from reviewPart1.java :)
                        System.out.println("F");
                    }
                    else if (average < 70.0) {
                        System.out.println("D");
                    }
                    else if (average < 80.0) {
                        System.out.println("C");
                    }
                    else if (average < 90.0) {
                        System.out.println("B");
                    }
                    else if (average <= 100.0) {
                        System.out.println("A");
                    }
                }
            }
        }
    }
}