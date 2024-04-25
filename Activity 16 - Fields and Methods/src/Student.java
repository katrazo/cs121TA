/**
 * An object class representing a student, made for the Canvas Activity, linked below
 * @see <a href="https://bsu.instructure.com/courses/151323/assignments/1755694">Activity 16 on Canvas</a>
 * @see StudentTest
 */
public class Student {
    // instance variables
    private String name;    // Student's name
    private String major;   // Student's selected major
    private int credits;    // # of credit hours the student has
    private int standing;       // # of years the student has been in school, including the current year
    private double GPA;     // GPA of the student

    // constructor
    public Student(String name, String major, int credits, int standing, double GPA) {
        this.name = name;
        this.major = major;
        this.credits = credits;
        this.standing = standing;
        this.GPA = GPA;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getStanding() {
        return standing;
    }
    public void setStanding(int standing) {
        this.standing = standing;
    }

    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

}