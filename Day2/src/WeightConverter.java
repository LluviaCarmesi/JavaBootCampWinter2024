import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        final double WEIGHT_MULTIPLIER = 2.20462;
        double weightInPounds, weightInKG;
        // Write a program that converts a weight in pounds to a mass in kg

        System.out.println("Hello, I will convert your weight in pounds to kg");
        // Read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your weight in pounds?");
        weightInPounds = keyboard.nextDouble();
        // Process
        weightInKG = weightInPounds / WEIGHT_MULTIPLIER;
        // Output
        System.out.println("Your weight in kg is: " + weightInKG);
    }
}
