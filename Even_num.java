import java.util.Scanner;

public class Even_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int evenCount = 0, oddCount = 0;

        // Input elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();

            // Check even or odd
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output the results
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);

        
    }
}
