import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OOP22_time {
    public static void main(String[] args){

        /*
        How to work with DATES & TIMES using Java
        (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
         */

        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy\nHH:mm:ss");
        String newDateTime = datetime.format(formatter);

        System.out.println(newDateTime);

    }
}
