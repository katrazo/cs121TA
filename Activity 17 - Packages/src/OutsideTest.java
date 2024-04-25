import packagesDemo.*; // since it's in another package, it has to be imported, even in the same project.

/**
 * Optionally also tests the same as FruitTest.java, but outside the package to show minor differences.
 * Consult the README for more.
 * @see Fruit
 * @see FruitTest
 */
public class OutsideTest {
    public static void main(String[] args) {
        // create a new instance of the class
        Fruit myFruit = new Fruit("Apple", "red", 12, 0.78);

        // see which variables and methods can be run
        // comment out the ones that throw errors
        myFruit.name = "Orange";    // public  - can be accessed
        myFruit.color = "orange";   // public  - can be accessed
//        myFruit.radius = "8";       // private - cannot be accessed ; Compile-time error
//        myFruit.tastiness = "0.89"; // private - cannot be accessed ; Compile-time error

        System.out.println("This fruit is the color: " + myFruit.getColor());   // public    - can be used
//        myFruit.setColor("red");                                                // protected - cannot be accessed outside the Fruit class's package unless it's a subclass
//        myFruit.printTasty();                                                   // private   - cannot be accessed
//        myFruit.printDetails();                                                 // no keyword = package-private - cannot be accessed outside the Fruit class's package

    }
}
