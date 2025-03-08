import java.util.Scanner;

// Class to display employee detials
class Employee {
    // Attributes
    private final String name;
    private final int id;
    private final double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Main class to take user input and print Employee Detials
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = input.nextInt();

        // Create an array of class Employee
        Employee[] employees = new Employee[numEmployees];

        // Take user input for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("ID: ");
            int id = input.nextInt();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            employees[i] = new Employee(name, id, salary);
        }

        // Display the result
        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }

        input.close();
    }
}