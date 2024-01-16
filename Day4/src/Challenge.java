import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String videoGameChoice = "";
        double cost = 0;
        boolean isValidChoice = false;

        System.out.println("Welcome to Vapor! We sell a couple of video games here.");
        System.out.println("Please enter a video game you would like to buy");
        Scanner input = new Scanner(System.in);
        videoGameChoice += input.nextLine();

        while (!isValidChoice) {
            isValidChoice = true;
            switch (videoGameChoice.toLowerCase()) {
                case "skyrim" -> {
                    System.out.println("You have chosen Skyrim.");
                    System.out.println("This was released in 11/11/2011");
                    System.out.println("This is an RPG game where you take on the role of Dragonborn and must " +
                            "defeat the evil known as Alduin!");
                    cost = 4.99;
                }
                case "rocket league" -> {
                    System.out.println("You have chosen Rocket League.");
                    System.out.println("This was released in 07/07/2015");
                    System.out.println("Rocket League is a vehicular soccer video game developed and published by Psyonix.");
                    cost = 4.99;
                }
                case "elden ring" -> {
                    System.out.println("You have chosen Elden Ring.");
                    System.out.println("This was released in 02/25/2022");
                    System.out.println("Journey through the Lands Between, a new fantasy world created by Hidetaka Miyazaki, " +
                            "creator of the influential DARK SOULS video game series, and George R. R. Martin, author of " +
                            "The New York Times best-selling fantasy series, A Song of Ice and Fire.");
                    cost = 49.99;
                }
                case "red dead redemption 2" -> {
                    System.out.println("You have chosen Red Dead Redemption 2.");
                    System.out.println("This was released in 10/26/2018");
                    System.out.println("merica, 1899. The end of the Wild West era has begun. After a robbery goes badly wrong " +
                            "in the western town of Blackwater, Arthur Morgan and the Van der Linde gang are forced to flee. " +
                            "With federal agents and the best bounty hunters in the nation massing on their heels, the gang " +
                            "must rob, steal and fight their way across the rugged heartland of America in order to survive. " +
                            "As deepening internal divisions threaten to tear the gang apart, Arthur must make a choice " +
                            "between his own ideals and loyalty to the gang who raised him.");
                    cost = 29.99;
                }
                case "american truck simulator" -> {
                    System.out.println("You have chosen American Truck Simulator.");
                    System.out.println("This was released in 02/02/2016");
                    System.out.println("Experience the American Greatest - Drive the most famous American trucks and deliver " +
                            "various cargoes across the United States.");
                    cost = 9.99;
                }
                default -> {
                    System.out.println("That is not a valid game. Please try again!");
                    isValidChoice = false;
                    videoGameChoice = input.next();
                }
            }
        }

        System.out.println("The final cost of the game you chose is " + cost * 1.08625);
    }
}
