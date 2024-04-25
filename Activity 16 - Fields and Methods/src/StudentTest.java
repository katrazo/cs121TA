/**
 * Instantiates the Student object class and tests its methods.
 * @see Student
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Kat", "Computer Science", 61, 1, 3.60);

        System.out.println(student1.getName()+ "'s GPA: " + student1.getGPA());
        student1.setGPA(3.77);
        System.out.println(student1.getName()+ "'s GPA: " + student1.getGPA());
    }
}
