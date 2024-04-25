public class Course {
    String name;    // Name of the course
    String section; // Section listing of the course, ex. CS121, ENG104, etc.
    int credits;    // # of credit hours

    public Course(String name, String section, int credits) {
        this.name = name;
        this.section = section;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): %s credits%n", name, section, credits);
    }

    // Getters and Setters (remove unused)
}
