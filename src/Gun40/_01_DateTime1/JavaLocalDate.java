package Gun40._01_DateTime1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate Sadece gün ay yıl  bilgisini tutar.
        LocalDate tarih = LocalDate.now();// suandakı tarihi ver
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getEra() = " + tarih.getEra());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
            //kendisindeki hazır formatlara bakalım
        System.out.println("ISO_DATE= "+tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDİUM= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n******* istediğimiz formatta gösterelim **************");
        System.out.println("tarih = " + tarih);
        
        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("tarih dd/MM/yyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy = " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(ozelFormat3));

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(ozelFormat4));

        DateTimeFormatter ozelFormat5=DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yyyy");
        System.out.println("tarih MMMM EEEE dd.MM.yyyy = " + tarih.format(ozelFormat5));

        DateTimeFormatter ozelFormat6=DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih MMMM dd EEEE yyyy = " + tarih.format(ozelFormat6));










    }
}
