import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        // input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Space_Bar");
        System.out.println("You can only get in if you are 21 years old.");
        System.out.println("How old are you?");
        int age = keyboard.nextInt();

        // processing
        if (age > 21) {
            System.out.println("Welcome to the Space_Bar");
        }
        else {
            int yearsToWait = 21 - age;
            System.out.println("You're not old enough.");
            System.out.println("Come back in " + yearsToWait + " years");
        }
    }
}
