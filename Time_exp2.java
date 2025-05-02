
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Time_exp2{
    public static void main(String[] args) {
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        DateTimeFormatter  df = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        
        DateTimeFormatter  df1 = DateTimeFormatter.ofPattern("H:m:a -- E -- M/Y");
         String myDate = dt.format(df);
         System.out.println(myDate);
         String time = dt.format(df1);
         System.out.println(time);
        

    }
}