import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // type name = value
        Scanner input = new Scanner(System.in);
        System.out.println("How many days of temperature data do you have?");
        int days = input.nextInt();
        int sum = 0;
        double average = 0;
        int[] temps = new int[days];
        for (int i = 0; i < days; i++) {
            System.out.println("Input the temp in F for day " + (i + 1));
            temps[i] = input.nextInt();
        }
        for (int i = 0; i < days; i++) {
            System.out.println("The temperature on day " + (i + 1) + " was " + temps[i]);
            if (temps[i] <= -15) {
                System.out.println("School should be cancelled this day");
            }
            sum = sum + temps[i];
            System.out.println("**************************");
        }
        average = (double)sum / days;
        System.out.println("The average temperature was: " + average);
    }
}
