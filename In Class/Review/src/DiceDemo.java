public class DiceDemo {
    public static void main(String[] args) {
        // Create a six-sided die
        Die die = new Die(60);
        System.out.println("The die has " + die.getSides() + " sides.");
        System.out.println("The die has a value of " + die.getValue());
        System.out.println("Rolling the die...");
        die.roll();
        System.out.println("The die has a value of " + die.getValue());
    }
}
