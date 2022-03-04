public class HandOfDice {
    // instance variables
    private int numDice;
    private int numSides;
    private Die[] dice;

    // constructor
    public HandOfDice(int numDice, int numSides) {
        this.numDice = numDice;
        this.numSides = numSides;
        dice = new Die[numDice];
        for (int i = 0; i < numDice; i++) {
            dice[i] = new Die(numSides);
        }
    }

    // Accessor methods
    public int getNumDice() {
        return numDice;
    }

    public int getNumSides() {
        return numSides;
    }

    public Die[] getDice() {
        return dice;
    }

    // Instance methods
    public int getTotal() {
        int total = 0;

        for (Die die : this.dice) {
            total += die.getValue();
        }
        
        return total;
    }

    public void roll() {
        for (Die die : this.dice) {
            die.roll();
        }

    }
}
