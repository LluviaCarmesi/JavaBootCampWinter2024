import java.util.Scanner;

public class StringIfElse {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the password?");
        String password = keyboard.next();

        if (password.equals("None")) {
            System.out.println("Welcome to the club");
        }
        else {
            System.out.println("Sorry, that was incorrect");
        }
    }
}
