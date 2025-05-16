import java.util.Scanner;

public class OddMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range from user
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        long product = 1;
        boolean foundOdd = false;

        // Multiply only odd numbers in the range
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                product *= i;
                foundOdd = true;
            }
        }

        if (foundOdd) {
            System.out.println("Product of odd numbers from " + start + " to " + end + " is: " + product);
        } else {
            System.out.println("No odd numbers found in the given range.");
        }

        scanner.close();
    }
}
