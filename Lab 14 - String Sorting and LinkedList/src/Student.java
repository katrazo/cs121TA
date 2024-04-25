import java.util.LinkedList;

public class Student {
    private String firstName;               // Student's first name
    private String lastName;                // Student's last name
    private int id;                         // Student's ID number
    private String major;                   // Student's declared major/degree
    private String classStanding;           // Student's status by chronology (e.g., Freshman, Sophomore, etc.)
    private double gpa;                     // Student's current Grade-Point Average

    private LinkedList<String> courses;     // Names of courses in which the student is enrolled

    public Student(String firstName, String lastName, int id, String major, String classStanding, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;

        courses = new LinkedList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }
    public void removeCourse(String course) {
        courses.remove(course);
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s%nID: %d%nMajor: %s%nClass: %s%nGPA: %.3f%n",
                firstName, lastName, id, major, classStanding, gpa);
    }

    public void sortCourseList() {
        // Uses insertion sort and Unicode values
        String temp;
        for (int i = 0; i < courses.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (courses.get(j).compareToIgnoreCase(courses.get(j-1)) < 0) {
                    temp = courses.get(j);
                    courses.set(j, courses.get(j-1));
                    courses.set(j-1, temp);
                }
            }
        }
    }

    public StringBuilder getStudentCourses() {
        StringBuilder courseList = new StringBuilder();
        for (String course : courses) {
            courseList.append(String.format("%s%n", course));
        }
        return courseList;
    }
}
