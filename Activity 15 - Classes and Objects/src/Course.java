/**
 * A basic object class that stores information for a course akin to a college or high school class.
 * @see Test
 */
public class Course {
    // Instance variables
    private String courseName;      // The name of the course (ex. CS121)
    private int credits;            // The credit hours provided by the course (ex. 3)
    private String professorName;   // The name of the professor administering the course
    private boolean weighted;       // Whether or not the course is weighted for GPA calculations

    // Constructor
    public Course(String courseName, int credits, String professorName, boolean weighted) {
        this.courseName = courseName;
        this.credits = credits;
        this.professorName = professorName;
        this.weighted = weighted;
    }

    // Another toString() for variable usage
    public String toString() {
        return "-=-=- Course -=-=-\n" +
                "Course Name: '" + courseName + "'\n" +
                "Credits:      " + credits + "\n" +
                "Professor:   '" + professorName + "'\n" +
                "Weighted:     " + weighted;
    }
}
