package abstractClasses;

public abstract class Animal {
    protected String name;
    protected String breed;
    protected int age;
    protected String sound;

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", sound='" + sound + '\'' +
                '}';
    }
}
