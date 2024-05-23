package DateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);//yyyy-mm-dd todays date

        LocalDate localDate1=LocalDate.from(ZonedDateTime.now());
        System.out.println(localDate1);//yyyy-mm-dd todays date

        LocalDate localDate2=LocalDate.of(1999,04,15);
        System.out.println(localDate2);//1999-04-15

        String s="2000-12-12";
        LocalDate localDate3=LocalDate.parse(s);
        System.out.println(localDate3);

        String s="2000-12-12";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
         LocalDate localDatee=LocalDate.parse(s);
        String s1=localDatee.format(dateTimeFormatter);
        System.out.println(s1);//12-12-2000

        LocalDate yesterday=localDate.minusDays(1);
        LocalDate tomarrow=localDate.plusDays(1);
        System.out.println(yesterday+" "+tomarrow);//2024-05-14  2024-05-16
    }
}
