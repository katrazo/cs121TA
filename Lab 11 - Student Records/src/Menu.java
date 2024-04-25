import java.util.Scanner;

public class Menu {
    Scanner consoleScanner = new Scanner(System.in);
    StudentRecord record = new StudentRecord();

    public void displayMenu() {
        int input = 0;
        while (input != 5) {
            System.out.printf("%n********* MENU *********%nPlease make a selection:%n" +
                    "1) Create a New Student%n" +
                    "2) Remove an Existing Student%n" +
                    "3) Display Student Info%n" +
                    "4) Display All Students' Info%n" +
                    "5) Exit%n" +
                    ">> ");
            try {
                input = Integer.parseInt(consoleScanner.nextLine());

                switch (input) {
                    case 1 -> createStudent();
                    case 2 -> removeStudent();
                    case 3 -> displayStudent();
                    case 4 -> displayAllStudents();
                    case 5 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid entry. Please try again.");
                }
            } catch (NumberFormatException e) {
                // Thrown when Integer.parseInt() cannot successfully convert a String to an Integer
                System.out.println("That is not a number. Returning to Menu...");
            }
        }
    }

    public void createStudent() {
        System.out.print("Enter the student's name: ");
        String name = consoleScanner.nextLine();
        System.out.print("Enter the student's GPA: ");
        double gpa = Double.parseDouble(consoleScanner.nextLine());
        System.out.print("Enter the student's standing: ");
        String standing = consoleScanner.nextLine();

        Student newStudent = new Student(name, gpa, standing);

        System.out.printf("Enter courses for %s.%n", name);
        String courseName;
        String courseSection;
        int courseCredits;

        while (true) {
            System.out.print("\tEnter a course name or q if finished: ");
            courseName = consoleScanner.nextLine();
            if (courseName.equals("q"))
                break;

            System.out.print("\tEnter course's section listing: ");
            courseSection = consoleScanner.nextLine();

            System.out.print("\tEnter course's amount of credits: ");
            courseCredits = Integer.parseInt(consoleScanner.nextLine());

            newStudent.addCourse(new Course(courseName, courseSection, courseCredits));
        }
        record.addStudent(newStudent);
        System.out.println(newStudent.getName() + " added to Student Record.");
    }

    private void removeStudent() {
        System.out.print("Enter the name of the Student to remove: ");
        String name = consoleScanner.nextLine();
        Student studentToRemove = record.getStudent(name);
        if (studentToRemove == null)
            System.out.println("Student not found.");
        else {
            record.removeStudent(studentToRemove);
            System.out.println(name + " removed from Student Record.");
        }
    }

    private void displayStudent() {
        System.out.print("Enter the name of the Student to display: ");
        String name = consoleScanner.nextLine();
        Student studentToDisplay = record.getStudent(name);
        if (studentToDisplay == null) {
            System.out.println("Student not found.");
        }
        else {
            System.out.print(studentToDisplay);
            System.out.printf("%s's courses:%n", studentToDisplay.getName());
            System.out.print(studentToDisplay.getAllCourses());
        }
    }

    private void displayAllStudents() {
        System.out.print(record.getAllStudents());
    }
}
