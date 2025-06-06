import java.util.Arrays;
import java.util.List;

public class exp1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 9, 12, 7, 6);
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers in the list: " + sum);
    }
}
