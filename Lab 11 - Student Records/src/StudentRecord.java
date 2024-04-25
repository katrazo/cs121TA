import java.util.ArrayList;

public class StudentRecord {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public Student getStudent(String name){
        Student foundStudent = null;
        for(Student student : students){
            if(student.getName().equals(name)){
                foundStudent = student;
                break;
            }
        }
        return foundStudent;
    }
    public StringBuilder getAllStudents() {
        int counter = 1;
        StringBuilder studentsInfo = new StringBuilder();
        for (Student student : students) {
            studentsInfo.append(String.format("%d. %s", counter, student));
            counter++;
        }
        return studentsInfo;
    }
}
