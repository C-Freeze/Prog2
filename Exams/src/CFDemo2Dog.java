// CFDemoDog.java
// Carter Freeze
// 3/16/22
// Exam 2 Part 3
public class CFDemo2Dog {
    public static void main(String[] args) {
        CFDog[] dogs = {
            new CFDog("Abe"),
            new CFDog("Bob"),
            new CFDog("Cutie"),
            new CFDog("Dippy"),
            new CFDog("Edie")
        };

        //Initialize dog info
        System.out.println("Before Updates:");
        printDogs(dogs);

        //Phase 1: Update the weight of the first dog
        dogs[0].setWeight(95); //Set weight of Abe to 95
        dogs[0].setBreed("Great Dane"); //Set breed of Abe to Great Dane
        System.out.println("After phase 1 updates:");
        printDogs(dogs);

        //Phase 2: Update the info of two other dogs
        dogs[1].setWeight(45); //Set weight of Bob to 45
        dogs[1].setBreed("Poodle"); //Set breed of Bob to Poodle
        dogs[2].setWeight(25); //Set weight of Cutie to 25
        dogs[2].setBreed("Pug"); //Set breed of Cutie to Pug
        System.out.println("After phase 2 updates:");
        printDogs(dogs);


    }

    public static void printDogs(CFDog[] dogs) {
        for (CFDog dog : dogs) {
            System.out.println(dog);
        }
    }
}
