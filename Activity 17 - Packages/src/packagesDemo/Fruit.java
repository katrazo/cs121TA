package packagesDemo;

/**
 * An example object class to be used for testing the consequences of different keywords.
 * Consult the README for more.
 * @see FruitTest
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1748041">Activity 17 on Canvas</a>
 */
public class Fruit {
    // 4-5 instance variables (2 public, the rest private)
    public String name;         // PUBLIC - Name of the fruit
    public String color;        // PUBLIC - Color of the fruit
    private int radius;         // PRIVATE - radius of fruit in cm
    private double tastiness;   // PRIVATE - on a scale of 0.00 to 1.00, how tasty the fruit is

    // a constructor
    public Fruit(String name, String color, int radius, double tastiness) {
        this.name = name;
        this.color = color;
        this.radius = radius;
        this.tastiness = tastiness;
    }

    // 4 methods, each using a different access modifier
    // (these can be literally whatever you want, they don't have to be getters/setters)
    public String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    private void printTasty() {
        if (tastiness >= 0.5)
            System.out.println("Mmm, tasty.");
        else
            System.out.println("Not my favorite fruit.");
    }

    void printDetails() {
        System.out.println("Fruit:  " + name);
        System.out.println("Color:  " + color);
        System.out.println("Radius: " + radius);
        System.out.println("Tasty%: " + tastiness + "%");
    }
}
