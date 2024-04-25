/**
 * A basic object class that stores information for a dog.
 * @see Test
 */
public class Dog {
    // -=-=- Instance Variables -=-=-
    private String name;    // The dog's name
    private String breed;   // The dog's breed type
    private int age;        // The dog's age, in years
    private double weight;  // The dog's weight, in pounds

    // Constructor
    // Tip - for a basic constructor use alt+insert or right-click and press Generate
    //     then select Constructor, select all, and press OK
    public Dog(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    // A method that uses all variables
    // toString is a very important method that can also be made with the Generate tab
    public String toString() {
        return "-=-=- Dog -=-=-\n" +
                "Name:   '" + name + "'\n" +
                "Breed:  '" + breed + "'\n" +
                "Age:     " + age + " Years\n" +
                "Weight:  " + weight + " lbs.";
    }
}
