public class EvenDivision {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 4;

        if (isEven(num1) && isEven(num2)) {
            if (num2 != 0) {
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Both numbers must be even.");
        }
    }

    // Helper method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}