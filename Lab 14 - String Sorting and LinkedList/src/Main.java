public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 1234,
                                        "CS", "Freshman", 3.761);
        student.addCourse("CS121");
        student.addCourse("MATH200");
        student.addCourse("ENG150");
        student.addCourse("BIO110");


        System.out.println("Print Student Info:");
        System.out.println(student.toString());

        System.out.println("Print Unordered Student Courses:");
        System.out.println(student.getStudentCourses());

        System.out.println("Print Ordered Student Courses:");
        student.sortCourseList();
        System.out.println(student.getStudentCourses());

        System.out.println("Print Removed Student Courses:");
        student.removeCourse("MATH200");
        System.out.println(student.getStudentCourses());
    }
}
