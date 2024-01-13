import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        // Program that tells me if someone is good at CounterStrike 2
        // If KDR is 2 or above, print "Not bad"
        // If lower, then print "Practice harder and try again next time"
        // Don't ask for KDR Ask for kills and deaths

        // input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I'm going to see if you did a good job in a CounterStrike 2 match");
        System.out.println("How many kills did you get in the match?");
        int kills = keyboard.nextInt();
        System.out.println("How many deaths did you get in the match?");
        int deaths = keyboard.nextInt();

        // processing
        double KDR = (double)kills / deaths;

        // output
        if (KDR >= 2) {
            System.out.println("You got a " + KDR + " KDR. Not bad");
        }
        else {
            System.out.println("You got a " + KDR + " KDR. Practice harder and try again next time");
        }
    }
}
