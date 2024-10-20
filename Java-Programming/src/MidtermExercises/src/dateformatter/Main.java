package dateformatter;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import dateformatter.*;
public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Formatted date: " + DateFormatter.getFormattedDate(now));
        System.out.println("Formatted time: " + DateFormatter.getFormattedTime(now));
    }
}
