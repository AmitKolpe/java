import java.time.LocalDate;
import java.util.Scanner;

public class Birth{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for birth date
        System.out.print("Enter your birth year (e.g. 1990): ");
        int year = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        // Store birth date
        LocalDate birthDate = LocalDate.of(year, month, day);

        // Print the stored birth date
        System.out.println("Your birth date is: " + birthDate);

        scanner.close();
    }
}
