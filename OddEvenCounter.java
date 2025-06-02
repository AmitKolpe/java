import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of elements
        System.out.print("Enter how many numbers you want to input: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Input: elements of the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Count even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output the results
        System.out.println("Total Even numbers: " + evenCount);
        System.out.println("Total Odd numbers: " + oddCount);

        scanner.close();
    }
}
