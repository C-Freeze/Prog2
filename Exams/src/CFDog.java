// CFDog.java
// Carter Freeze
// 3/16/22
// Exam 2 Part 1
public class CFDog {
    private int weight;
    private String breed;
    private String name;
    private String bark;

    public CFDog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;

        setBark();
    }

    public CFDog(String name) {
        this.name = name;
        this.breed = "Unknown";
        this.weight = 0;

        setBark();
    }

    // Accessor and Mutator methods
    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        setBark(); // Update bark
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBark() {
        // Determines bark based on weight
        if (this.weight == 0) { // if the weight is unknown
            this.bark = "Arf Arf";
            return; // return early
        } else if (this.weight < 30) { // if the weight is less than 30
            this.bark = "Yip Yip";
            return; // return early
        } else if (this.weight <= 85) {
            this.bark = "Ruff Ruff";
            return; // return early
        }
        // if the weight is greater than 85
        this.bark = "Woof Woof";
        return; // return early
    }

    @Override
    public String toString() {
        return String.format("%10s %10s %3d pounds %s", this.name, this.breed, this.weight, this.bark);
    }
}