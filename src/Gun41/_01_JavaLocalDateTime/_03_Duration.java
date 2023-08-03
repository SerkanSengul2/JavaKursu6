package Gun41._01_JavaLocalDateTime;

import java.time.*;

public class _03_Duration {
    public static void main(String[] args) {
        //Duration :LocalTime ve LocalDateTime'lar arası fark için kullanılır.
        
        //LocalTime
        long starTime=System.currentTimeMillis();
        LocalTime DersinBaslangicSaati=LocalTime.of(19,0,0);
        LocalTime DersinBitisSaati=LocalTime.of(22,0,0);
        Duration GunlukDersSuresi=Duration.between(DersinBaslangicSaati,DersinBitisSaati);//toplam hali
        System.out.println("GunlukDersSuresi.toDays() = " + GunlukDersSuresi.toDays());//toplam hali
        System.out.println("GunlukDersSuresi.toHours() = " + GunlukDersSuresi.toHours());//toplam hali
        System.out.println("GunlukDersSuresi.toMinutes() = " + GunlukDersSuresi.toMinutes());//toplam hali
        System.out.println("GunlukDersSuresi.toMillis() = " + GunlukDersSuresi.toMillis());//toplam hali
        System.out.println("GunlukDersSuresi.toNanos() = " + GunlukDersSuresi.toNanos());//toplam hali
        System.out.println("GunlukDersSuresi = " + GunlukDersSuresi);
        System.out.println("GunlukDersSuresi.getSeconds() = " + GunlukDersSuresi.getSeconds());

        System.out.println("*********** LocalDateTime *************");

        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();
        Duration fark=Duration.between(from,to);
        System.out.println("fark = " + fark);
        System.out.println("fark.toDays() = " + fark.toDays());// farkın toplam guu
        System.out.println("fark.toHours() = " + fark.toHours());// farkın toplam saati
        System.out.println("fark.toMinutes() = " + fark.toMinutes());// farkın toplam dakikası

        long Finishtime=System.currentTimeMillis();//suandakı mılısanıye cınsınden zaman
        System.out.println("(Finishtime-starTime) = " + (Finishtime-starTime)+"ms");


        
        
        
    }
}
