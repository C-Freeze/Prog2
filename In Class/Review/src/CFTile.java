// CFTile.java
// Carter Freeze
// 2/17/2022
// Makes scrabble tiles

public class CFTile {
    // Class variables
    private char letter;
    private int value;

    // Constructor
    public CFTile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public static void main(String[] args) {
        // Create a new tile
        CFTile tile = new CFTile('Z', 10);
        // Print the tile
        printTile(tile);
    }

    // Mutators
    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Accessors
    public char getLetter() {
        return this.letter;
    }

    public int getValue() {
        return this.value;
    }

    // Class methods
    public static void printTile(CFTile tile) {
        System.out.printf("%c: %d\n", tile.letter, tile.value);
    }

    @Override // Overrides the toString method
    public String toString() {
        return String.format("%c: %d", letter, value);
    }

    @Override // Overrides the equals method
    public boolean equals(Object obj) { // Object is some other object, could be a string, int, etc.
        if (obj instanceof CFTile) { // Checks if the object is a CFTile, if not, return false

            CFTile other = (CFTile) obj; // Casts the object to a CFTile, this really isn't doint anything
                                         // as we already know it is a CFTile, it prevents errors in my IDE
                                

            return this.letter == other.getLetter() && this.value == other.getValue(); // Gotta save cpu cycles, I
                                                                                       // wasted doing the cast by
                                                                                       // not using a variable
        }
        return false;
    }

    public static void PrintTile(CFTile tile){
        System.out.printf("This is your letter %c. This is your value %d.", tile.letter, tile.value);
    }

}