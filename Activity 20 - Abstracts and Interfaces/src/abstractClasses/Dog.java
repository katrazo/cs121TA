package abstractClasses;

public class Dog extends Animal{
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
        sound = "woof!";
    }

    @Override
    public void makeSound() {
        System.out.printf("%s, tail wagging, bounds over and says, \"%s\"%n", name, sound);
    }
}
