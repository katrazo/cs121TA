import java.util.ArrayList;

public class EmployeeRecord {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String getAllEmployees() {
        StringBuilder allEmployees = new StringBuilder();
        for (Employee employee : employees) {
            allEmployees.append(employee).append(String.format("%n"));
        }
        return allEmployees.toString();
    }
}
