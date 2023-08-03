package Gun41._01_JavaLocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaLocalDateTime {
    public static void main(String[] args) {
        //LocalDateTime hem tarih hemde saat bilgisini tutar.

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonth().getValue() = " + dt.getMonth().getValue());
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfYear());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getDayOfWeek() = " + dt.getDayOfWeek());

        System.out.println("dt = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        //özel fortmatta istediğimiz gibi yazdırma

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.YYYY hh:mm");

        System.out.println("f.format(f) = " + dt.format(f));

        
        
        

    }
}
