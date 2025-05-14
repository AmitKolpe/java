import java.time.LocalDate;
import java.time.DayOfWeek;

public class Day{
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();

        // Get the day of the week
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        // Print the day
        System.out.println("Today is: " + dayOfWeek);
    }
}
