package Gun41._01_JavaLocalDateTime;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        //Period 2 tarih arasındaki farkı tutar.
        //LocalDate'ler için kullanıılır

        LocalDate dogumtarihi=LocalDate.of(1990,4,23);
        LocalDate bugununtarihi=LocalDate.now();

        Period fark=Period.between(dogumtarihi,bugununtarihi);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        /*************************************************************/

        Period period3gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);
        System.out.println("period3Ay = " + period3Ay.getMonths());
        System.out.println("period3gun = " + period3gun.getDays());


        LocalDate ucgunsonra= bugununtarihi.plus(period3gun);
        System.out.println("ucgunsonra = " + ucgunsonra);

        LocalDate ucaysonra=bugununtarihi.plus(period3Ay);
        System.out.println("ucaysonra = " + ucaysonra);
        
        

        //kursun bitis tarihini bulunuz 6 ay/ 15.05.2023
        System.out.println("*****************************************");
        LocalDate kursunbaslangici=LocalDate.of(2023,5,15);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursunbitisi=kursunbaslangici.plus(kursSure);
        System.out.println("kursunbitisi = " + kursunbitisi);
        System.out.println("kursunbitisi.getDayOfWeek() = " + kursunbitisi.getDayOfWeek());

        //2.soru : Kursun bitmesine ne kadar süre kaldı
        
        Period nekadarsurekaldi=Period.between(bugununtarihi,kursunbitisi);
        System.out.println("nekadarsurekaldi.getDays() = " + nekadarsurekaldi);
        
        //3. soru ne kadar süredir devam ediyor
        
        Period suanakadardevamsuresi=Period.between(kursunbaslangici,bugununtarihi);
        System.out.println("suanakadardevamsuresi.getMonths() = " + suanakadardevamsuresi);



        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
