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

    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon();
        pokemon1.name = "Tododile";
        pokemon1.attack = 20;
        pokemon1.hitPoints = 30;
        pokemon1.level = 3;
        pokemon1.type = "Water";

        pokemon1.printPokeData();
    }
}
