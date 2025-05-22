import java.util.ArrayList;
import java.util.Scanner;

class Exam {
    String subject;
    String date;
    String time;

    public Exam(String subject, String date, String time) {
        this.subject = subject;
        this.date = date;
        this.time = time;
    }

    public void display() {
        System.out.printf("%-20s %-15s %-10s\n", subject, date, time);
    }
}

public class ExamTimeTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Exam> exams = new ArrayList<>();

        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for subject " + (i + 1) + ":");
            System.out.print("Subject Name: ");
            String subject = scanner.nextLine();
            System.out.print("Exam Date (dd-mm-yyyy): ");
            String date = scanner.nextLine();
            System.out.print("Exam Time (e.g., 10:00 AM): ");
            String time = scanner.nextLine();

            exams.add(new Exam(subject, date, time));
        }

        // Display timetable
        System.out.println("\n--- Exam Timetable ---");
        System.out.printf("%-20s %-15s %-10s\n", "Subject", "Date", "Time");
        System.out.println("-------------------------------------------------");
        for (Exam exam : exams) {
            exam.display();
        }

        scanner.close();
    }
}
