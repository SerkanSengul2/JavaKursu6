package Gun41._01_JavaLocalDateTime;

import java.time.LocalDate;

public class _05_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);
        boolean sonraMi=bugun.isAfter(dun);//bugun dunden sonra mı
        System.out.println("sonraMi = " + sonraMi);
        
        boolean onceMi=bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);
        
        boolean esitMi=bugun.equals(dun);
        System.out.println("esitMi = " + esitMi);

        boolean ArtikYil=bugun.isLeapYear();
        System.out.println("ArtikYil = " + ArtikYil);
        
        
    }
}
