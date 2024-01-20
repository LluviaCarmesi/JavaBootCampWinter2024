import java.util.Scanner;

public class PokemonSapphire {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon(); // Player 1
        pokemon1.name = "Tododile";
        pokemon1.attack = 40;
        pokemon1.hitPoints = 100;
        pokemon1.level = 10;
        pokemon1.type = "Water";
        int pokemon1PotionCount = 3, pokemon2PotionCount = 3;

        Pokemon pokemon2 = new Pokemon(); // Player 2
        pokemon2.name = "Pikatchu";
        pokemon2.attack = 30;
        pokemon2.hitPoints = 90;
        pokemon2.level = 7;
        pokemon2.type = "Electric";

        Scanner input = new Scanner(System.in);
        boolean isFightOver = false;

        while (!isFightOver) {
            System.out.println("It's " + pokemon1.name + "'s turn");
            System.out.println("What would you like to do?");
            System.out.println("(A)ttack");
            System.out.println("(U)se Potion");
            System.out.println("(R)etreat");
            String player1Action = input.nextLine();

            switch (player1Action.toLowerCase()) {
                case "a" -> {
                    pokemon1.attacks(pokemon2);
                    if (pokemon2.hitPoints <= 0) {
                        isFightOver = true;
                        continue;
                    }
                }
                case "u" -> {
                    if (pokemon1PotionCount > 0) {
                        System.out.println("What type of potion would you like to use?");
                        String type = input.nextLine();
                        pokemon1.usePotion(type);
                        pokemon1PotionCount--;
                    } else {
                        System.out.println("Out of potions");
                    }
                }
                case "r" -> {
                    pokemon1.retreat();
                }
            }

            System.out.println("It's " + pokemon2.name + "'s turn");
            System.out.println("What would you like to do?");
            System.out.println("(A)ttack");
            System.out.println("(U)se Potion");
            System.out.println("(R)etreat");
            String player2Action = input.nextLine();

            switch (player2Action.toLowerCase()) {
                case "a" -> {
                    pokemon2.attacks(pokemon1);
                    if (pokemon1.hitPoints <= 0) {
                        isFightOver = true;
                        continue;
                    }
                }
                case "u" -> {
                    if (pokemon2PotionCount > 0) {
                        System.out.println("What type of potion would you like to use?");
                        String type = input.nextLine();
                        pokemon2.usePotion(type);
                        pokemon2PotionCount--;
                    } else {
                        System.out.println("Out of potions");
                    }
                }
                case "r" -> {
                    pokemon2.retreat();
                }
            }
        }
        if (pokemon1.hitPoints >= 0) {
            System.out.println("The battle is over and " + pokemon1.name + " has won!");
        } else {
            System.out.println("The battle is over and " + pokemon2.name + " has won!");
        }
    }
}
