import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        // Write a program that asks a user for a number bigger than 10
        // If the user gives them a number bigger than 10, print "thank you"
        // If the number is not bigger than 10, ask again until we get it

        System.out.println("Hello, please give me a number bigger than 10!");

        // input
        Scanner keyboard = new Scanner(System.in);
        double numberGiven = keyboard.nextInt();

        // processing
        while (numberGiven <= 10) {
            System.out.println("Please give me a number bigger than 10.");
            numberGiven = keyboard.nextDouble();
        }

        // output
        System.out.println("Thank you!");
    }
}
