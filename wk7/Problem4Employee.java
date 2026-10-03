class Employee {

    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class Problem4Employee {

    public static void main(String[] args) {

        Employee emp = new Employee("Rahul", 40000);

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        emp.setSalary(45000);

        System.out.println("Updated Salary: " + emp.getSalary());
    }
}