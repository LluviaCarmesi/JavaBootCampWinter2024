import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        // Make a program that asks for the user's score on their last test
        // If it's a 90 or above, print "Good job"
        // else if it's below, print "You are a great disappointment to your mother and me

        // input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I'm going to see if you did good for mom and dad");
        System.out.println("Please input the grade of your last test.");
        int grade = keyboard.nextInt();

        // processing

        // output
        if (grade >= 90) {
            System.out.println("Good job!");
        }
        else {
            System.out.println("You are a great disappointment to your mother and me.");
        }
    }
}
