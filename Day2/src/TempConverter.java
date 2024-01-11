import java.util.Scanner;

public class TempConverter {
    public static void main (String[] args) {
        // Make a program that converts a Fahrenheit number into Celsius

        // input
        double tempInF, tempInC;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, I will convert a temp in F to a temp in C");
        System.out.println("Please input a temp in F: ");
        tempInF = keyboard.nextInt();

        // processing
        tempInC = ((tempInF - 32) * 5) / 9;

        //output
        System.out.println(tempInF + " in F is " + tempInC + " in C");
    }
}
