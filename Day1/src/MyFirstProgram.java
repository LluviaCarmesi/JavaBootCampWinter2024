import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("I will multiply 3 numbers for you!");
        System.out.println("Please enter the first number: ");
        num1 = keyboard.nextInt();
        System.out.println("Please enter the second number: ");
        num2 = keyboard.nextInt();
        System.out.println("Please enter the third number: ");
        num3 = keyboard.nextInt();
        System.out.println("The numbers add up to: " + (num1 * num2 * num3));
    }
}