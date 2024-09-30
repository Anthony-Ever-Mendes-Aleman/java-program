package week4Examples;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
public class TimeCalculator
{
    // method to get current time using LocalDateTime
    public void GetLocalDateTime()
    {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }

    //Method to get current time using ZoneDateTime

    public static void main(String[] args)
    {
        TimeCalculator tc = new TimeCalculator();
        tc.getCurrentZone();
        tc.GetLocalDateTime();

    }
    public void getCurrentZone()
    {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
    }
}




