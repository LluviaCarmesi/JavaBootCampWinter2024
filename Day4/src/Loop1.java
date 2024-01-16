import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Loop1 {
    public static void main(String[] args) {
        System.out.println("What number would you like to count down from?");
        // input
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();

        // processing
        do {
            System.out.println(number);
            number--;
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while(number > 0);
        System.out.println("Blast Off!");
    }
}
