package packagesDemo;

/**
 * Tests the consequences of different access modifiers from an Object Class, Fruit.
 * Consult the README for more.
 * @see Fruit
 */
public class FruitTest {
    public static void main(String[] args) {
        // create a new instance of the class
        Fruit myFruit = new Fruit("Apple", "red", 12, 0.78);

        // see which variables and methods can be run
        // comment out the ones that throw errors
        myFruit.name = "Pear";    // public  - can be accessed
        myFruit.color = "orange";   // public  - can be accessed
//        myFruit.radius = "8";       // private - cannot be accessed ; Compile-time error
//        myFruit.tastiness = "0.89"; // private - cannot be accessed ; Compile-time error

        System.out.println("This fruit is the color: " + myFruit.getColor());   // public    - can be used
        myFruit.setColor("green");                                              // protected - can be used in the same package (this), or by subclass
//        myFruit.printTasty();                                                   // private   - cannot be accessed
        myFruit.printDetails();                                                 // no keyword (default) = package-private - can be used in the same package
    }
}