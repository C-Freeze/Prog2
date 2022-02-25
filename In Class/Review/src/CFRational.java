// CFRational.java
// Carter Freeze
// 2/24/2022
// In Class 5 - Ration Number Class
public class CFRational {
    // This class defines a raional number

    // Instance variables
    private int numerator;
    private int denominator;

    public static void main(String[] args) {
        // Create a rational number
        CFRational r1 = new CFRational(1, 29);
        CFRational r2 = new CFRational(1, 34);
        CFRational r3 = r1.add(r2);

        // Display the rational number
        System.out.println(r3);
    }

    // Constructors
    public CFRational() {
        // Default constructor
        this.numerator = 0;
        this.denominator = 1;
    }

    public CFRational(int numerator, int denominator) {
        // Constructor with parameters
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Methods
    // Accessor Methods
    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    // Mutator Methods
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Instance Methods
    public void printRational() {
        System.out.print(this.numerator + "/" + this.denominator);
    }

    public void negate() {
        this.numerator = -this.numerator;
    }

    public void invert() {
        int temp = this.numerator; // Store numerator, since it will be changed
        this.numerator = this.denominator;
        this.denominator = temp;

        // Check to see if the denominator is negative
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    public void reduce() {
        // This method finds the greatest common divisor of the numerator and
        // denominator
        
        // Find the greatest common divisor of the numerator and denominator
        int gcd = 1;
        for (int i = 2; i <= this.numerator; i++) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                gcd = i;
            }
        }

        // Set the numerator and denominator to the reduced values
        this.numerator /= gcd;
        this.denominator /= gcd;

        // Check to see if the denominator is negative
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    public CFRational add(CFRational r2) {
        // This method adds two rational numbers
        int temp = this.denominator;
        int newNumerator = (this.numerator * r2.denominator) + (r2.numerator * temp);
        int newDenominator = this.denominator * r2.denominator;

        // Create a new rational number
        CFRational r3 = new CFRational(newNumerator, newDenominator);
        r3.reduce();
        return r3;
    }


    // ToString Method
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    // to double method
    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }
}
