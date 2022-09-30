package Learning.Localization;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;

public class FormatDatesAndTime {
    public static void main(String[] args) {
        // Format LocalDateTime with a pattern.
        LocalDateTime localDateTime = LocalDateTime.now();
        String pattern = "dd-MMMM-yyyy HH:mm:ss.SSS";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        String formattedDateTime = localDateTime.format(dateTimeFormatter);

        System.out.println(formattedDateTime);

        // With time zone
        TimeZone localTimeZone = TimeZone.getDefault();
        Locale.setDefault(
                Locale.US
        );

        System.out.println(localTimeZone.getDisplayName(Locale.getDefault()));


        // ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("ZonedDateTime:  " + zonedDateTime);
        System.out.println("ZonedDateTime to LocalDateTime:  " + zonedDateTime.toLocalDateTime());

        // Timestamp: yyyy-mm-dd hh:mm:ss
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        System.out.println("Timestamp:  " + timestamp);
    }
}
