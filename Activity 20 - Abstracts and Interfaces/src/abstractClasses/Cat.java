package abstractClasses;

public class Cat extends Animal{
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
        sound = "meow.";
    }

    @Override
    public void makeSound() {
        System.out.printf("%s looks at you slyly and says, \"%s\"%n", name, sound);
    }
}
