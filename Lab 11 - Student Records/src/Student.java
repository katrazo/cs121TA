import java.util.ArrayList;

public class Student {
    String name;        // Name of the student
    double gpa;         // GPA of the student
    String standing;    // Freshman, Sophomore, etc.

    ArrayList<Course> courses = new ArrayList<>();  // Courses in which the student is enrolled

    public Student(String name, double gpa, String standing) {
        this.name = name;
        this.gpa = gpa;
        this.standing = standing;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    public void removeCourse(int index) {
        courses.remove(index);
    }
    public Course getCourse(int index) {
        return courses.get(index);
    }
    public String getAllCourses() {
        StringBuilder coursesInfo = new StringBuilder();
        int counter = 1;
        for (Course course : courses) {
            coursesInfo.append(String.format("%d. %s", counter, course));
            counter++;
        }
        return coursesInfo.toString();
    }

    @Override
    public String toString() {
        return String.format("Student %s: %s with a %.3f GPA.%n", name, standing, gpa);
    }

    // Getters and Setters (remove unused)
    public String getName() {
        return name;
    }
}
