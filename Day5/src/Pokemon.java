public class Pokemon {
    //name, type, attack, hit points, level
    public String name;
    public String type;
    public int attack;
    public int hitPoints;
    public int level;

    public void printPokeData() {
        System.out.println("Printing out Poke Data for " + name);
        System.out.println("The name of the pokemon is: " + name);
        System.out.println("The type of the pokemon is: " + type);
        System.out.println("The attack points of the pokemon is: " + attack);
        System.out.println("The hit points of the pokemon is: " + hitPoints);
        System.out.println("The level of the pokemon is: " + level);
    }

    public int calculateDamageDealt() {
        int randomDamage = (int) (Math.random() * 6) + 1;
        int totalDamage = randomDamage + attack;
        return totalDamage;
    }

    public void usePotion(String type) {
        System.out.println("You used a " + type + " potion");
        switch (type) {
            case "Hi" -> {
                hitPoints = hitPoints + 30;
            }
            case "Super" -> {
                hitPoints = hitPoints + 20;
            }
            default -> {
                hitPoints = hitPoints + 10;
            }
        }
        System.out.println(name + " now has " + hitPoints + " hit points");
    }

    public void retreat() {
        System.out.println(name + " ran away");
        System.exit(0);
    }

    public void attacks(Pokemon opposingPokemon) {
        int damage;
        if (Math.random() > .9) {
            damage = calculateDamageDealt() * 2;
            System.out.println(name + " scored a critical hit against " + opposingPokemon.name + " for " + damage + " " + type + " damage");
        } else {
            damage = calculateDamageDealt();
            System.out.println(name + " attacks " + opposingPokemon.name + " for " + damage + " " + type + " damage");
        }
        opposingPokemon.hitPoints = opposingPokemon.hitPoints - damage;
        System.out.println(opposingPokemon.name + " now has " + opposingPokemon.hitPoints + " health");
    }
}
