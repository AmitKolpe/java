public class OddNumberDivision {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 5;

        if (isOdd(num1) && isOdd(num2)) {
            if (num2 != 0) {
                int result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Both numbers must be odd.");
        }
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
