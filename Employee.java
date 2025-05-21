import java.util.ArrayList;
import java.util.Scanner;

// Employee class to store employee data
class Employee{
    int id;
    String name;
    int age;
    String department;

    // Constructor
    public Employee(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Display employee details
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees to store: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Department: ");
            String dept = scanner.nextLine();

            Employee emp = new Employee(id, name, age, dept);
            employees.add(emp);
        }

        // Displaying all employee details
        System.out.println("\nStored Employee Details:");
        for (Employee emp : employees) {
            emp.displayInfo();
        }

        scanner.close();
    }
}
