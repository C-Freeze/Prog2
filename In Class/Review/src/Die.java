//Die.java
//Carter Freeze
//Date: 10/24/2017
//Description: This program simulates a die.

import java.util.Random;

public class Die {
    // Base class for all dice
    private int sides;
    private int value;

    // Constructor
    public Die(int sides) {
        this.sides = sides;
        this.value = this.roll();
    }

    // Acessor methods
    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }

    // Functionality
    public int roll() {
        Random rand = new Random();
        this.value = rand.nextInt(this.sides) + 1; // Generates a random number between 1 and the number of sides, this
                                                   // assumes all dice have the lowest value of 1
        return this.value;
    }

}
