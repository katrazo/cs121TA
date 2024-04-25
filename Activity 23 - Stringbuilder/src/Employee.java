public class Employee {
    private String name;
    private int id;
    private String position;
    private String department;

    public Employee(String name, int id, String position, String department) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("Employee %s:%nID - %d%nPosition - %s%nDepartment - %s%n", name, id, position, department);
    }
}
