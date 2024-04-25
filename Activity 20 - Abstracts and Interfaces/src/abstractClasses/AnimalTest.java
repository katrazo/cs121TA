package abstractClasses;

public class AnimalTest {
    public static void main(String[] args) {
        Dog myDog = new Dog("Smokey", "Mixed", 11);
        Cat myCat = new Cat("Sophie", "Orange Tabby", 5);

        myDog.makeSound();
        myCat.makeSound();

        System.exit(0);
    }
}
