import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        // Output
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Address: " + address);
        
        scanner.close();
    }
}
