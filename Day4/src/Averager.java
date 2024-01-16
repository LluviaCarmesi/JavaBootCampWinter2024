import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        // Take the average of 10 numbers
        double total = 0, average;
        System.out.println("I will take 10 numbers and get the average of them");
        // input
        Scanner keyboard = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Give me your number. This is number " + i);
            total += keyboard.nextDouble();
        }
        // processing
        average = total / 10;

        // Output is print the average
        System.out.println("The average of the numbers is " + average);
    }
}
