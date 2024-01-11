import java.util.Scanner;

public class BaconCounter {
    // How many slices of bacon do we need to eat in a day to survive?
    // How many calories does someone need to eat to survive?
    // Harris-Benedict Equation - Takes weight, height, and age to determine how many calories you take in a day
    // Women: BMR = 655 + (4.3 * weightInPounds) + (4.7 * heightInInches) - (4.7 * ageInYears)
    // Men: BMR = 66 + (6.3 * weightInPounds) + (12.9 * heightInInches) - (6.8 * ageInYears)
    public static void main(String[] args) {
        // Read Input
        String foodItem;
        double weightInPounds, heightInInches, maleBMR, femaleBMR,
                maleBaconCount, femaleBaconCount;
        int ageInYears, foodCalories;
        System.out.println("Hey, what food will you be eating?");
        Scanner keyboard = new Scanner(System.in);
        foodItem = keyboard.next();
        System.out.println("Hello, I will calculate the number " + foodItem + " you need in order to survive");
        System.out.println("How many calories are in this food item?");
        foodCalories = keyboard.nextInt();
        System.out.println("What is your weight in pounds?");
        weightInPounds = keyboard.nextDouble();
        System.out.println("What is your height in inches?");
        heightInInches = keyboard.nextDouble();
        System.out.println("What is your age in years?");
        ageInYears = keyboard.nextInt();

        // Process
        femaleBMR = 655 + (4.3 * weightInPounds) + (4.7 * heightInInches) - (4.7 * ageInYears);
        maleBMR = 66 + (6.3 * weightInPounds) + (12.9 * heightInInches) - (6.8 * ageInYears);
        femaleBaconCount = femaleBMR / foodCalories;
        maleBaconCount = maleBMR / foodCalories;
        // Calculate BMR
        // How many calories are in a slice of bacon? - 44
        // BMR / baconCalories of bacon

        // Output
        System.out.println("The number of  a man would need to survive a day is: " + maleBaconCount);
        System.out.println("The number of  a female would need to survive a day is: " + femaleBaconCount);
    }
}
