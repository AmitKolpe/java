import java.util.Scanner;

// Custom Exception Class
class CustumException extends Exception {
    public String toString() {
        return "There is no exception.";
    }

    public String getMessage() {
        return "The exception was found.";
    }
}

// Main class
public class Custum_exception {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();

        if (a < 10) {
            try {
                throw new CustumException();
            } catch (CustumException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        } else {
            System.out.println("No exception, number is >= 10");
        }
    }
}
