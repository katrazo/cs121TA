public class Main {
    public static void main(String[] args) {
        EmployeeRecord record = new EmployeeRecord();

        record.addEmployee(new Employee("John Doe", 1234, "HR representative", "HR"));
        record.addEmployee(new Employee("Jane Roe", 1255, "QA Analyst", "IT"));
        record.addEmployee(new Employee("Ron Joe", 9923, "CEO", "Upper Management"));

        System.out.println(record.getAllEmployees());

        System.exit(0);
    }
}
