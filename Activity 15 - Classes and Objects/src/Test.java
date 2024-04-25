/**
 * Tests the use cases of the object classes in this folder.
 * @see Dog
 * @see Course
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1748039">Activity 15 on Canvas</a>
 */
public class Test {
    public static void main(String[] args) {
        // Create instances of object classes
        Dog myDog = new Dog("Smokey", "Smooth Collie Terrier", 9, 50);
        Course myCourse = new Course("CS124", 3, "Dr. Lan", false);

        // Call the methods
        String myDogInfo = myDog.toString();
        String myCourseInfo = myCourse.toString();

        // Print the return values
        System.out.println(myDogInfo + "\n");
        System.out.println(myCourseInfo);

        // Alternatively, you can simply print Object.toString()
//        System.out.println(myDog.toString());
//        System.out.println(myCourse.toString());

        // Alternatively, you can simply print Object, because it implicitly calls toString() if the object has such a method;
//        System.out.println(myDog);
//        System.out.println(myCourse);
    }
}
