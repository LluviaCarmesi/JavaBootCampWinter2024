public class Dog {
    public String name;
    public int age;
    public String breed;
    public double weight;

    public void speak() {
        System.out.println(name + " sits and says:");
        System.out.println("Woof!");
    }

    public void doTrick() {
        System.out.println(name + " rolls over.");
    }
}
