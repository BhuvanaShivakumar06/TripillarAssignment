package Assignment1.Module2;

public class Employee {
    private String name;
    private double salary;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ravi");
        emp.setSalary(50000);

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}
