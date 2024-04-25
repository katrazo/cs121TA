/**
 * Preliminarily created class for the showcase.
 * For the Canvas assignment, I added more getters and setters.
 * See below for more pertaining to the assignment
 * @see Student
 * @see EmployeeTest
 */
public class Employee {
    // instance variables
    private String name;
    private String id;
    private double salary;
    private double bonus;
    private double raise;
    private double totalPay;

    // constructor
    public Employee(String name, String id, double salary, double bonus, double raise) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.raise = raise;
    }

    // method to calculate total pay
    public double calculateTotalPay() {
        totalPay = salary + bonus;
        return totalPay;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getRaise() {
        return raise;
    }
    public void setRaise(double raise) {
        this.raise = raise;
    }

    public double getTotalPay() {
        return totalPay;
    }
    // no setTotalPay() because we have a method above to calculate it

}