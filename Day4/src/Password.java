import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String user, pw;
        int attemptCount = 0;

        do {
            if (attemptCount > 0) {
                System.out.println("That was the wrong password!");
            }
            System.out.println("What's your username?");
            user = keyboard.next();
            System.out.println("What's your password?");
            pw = keyboard.next();
            attemptCount++;
        } while ((!user.equals("BruceWayne") || !pw.equals("ImBatman")) && attemptCount < 3);
        if (attemptCount >= 3) {
            System.out.println("You have tried too many times");
        }
        else {
            System.out.println("Welcome to the club!");
        }
    }
}
