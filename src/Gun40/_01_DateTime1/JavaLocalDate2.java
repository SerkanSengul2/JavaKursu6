package Gun40._01_DateTime1;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaLocalDate2 {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        DateTimeFormatter ozelFormat6 = DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih MMMM dd EEEE yyyy = " + tarih.format(ozelFormat6));
        //local'den aldıgım tarihi başka dilde formatta gösterimi
        System.out.println("******* başka dilde,formatta gösterimi********");
        System.out.println("Almanca tarih= " + tarih.format(ozelFormat6.withLocale(Locale.GERMAN)));
        //Lokalizasyon tanımlası ne demek:
        //en-Us  Amerikanın ingilizce konuşulan lokalizasyonu(bölgesi)
        //en-UK  İlgilterenin ingilizce konuşulan lokalizasyonu(bölgesi)
        //fr-CA: Kanada'nın fransızca konuşulan lokalizasyonu(bölgesi)
        //en-CA: Kanada'nın ingilizce konuşulan lokalizasyonu(bölgesi)
        //tr-TR: Türkiye'nin türkçe konuşulan lokalizasyonu(bölgesi)

        Locale LCince = new Locale("zh", "cn"); //Çin'nin zh konuşulan bölgesi
        System.out.println("Çince tarih= " + tarih.format(ozelFormat6.withLocale(LCince)));

        //Kullnılabilir Local'leri bulma
        Locale[] kullnabilirLokaller = Locale.getAvailableLocales();
        for (Locale L : kullnabilirLokaller) {

            if (!L.getDisplayCountry().toLowerCase().contains("tür")) continue;

            System.out.print(",Dili = " + L.getDisplayLanguage());
            System.out.print(",Ülkesi  = " + L.getDisplayLanguage());
            System.out.print(",Dili = " + L.getLanguage());
            System.out.println(",Ülkesi =" + L.getCountry());
            System.out.println();


        }
        Locale LTurkiye = new Locale("tr", "TR");
        System.out.println(("Türkçe tarih = " + tarih.format(ozelFormat6.withLocale(LTurkiye))));
        System.out.println("\n****************");
        //tarih=2053-5.20; gibi kendimiz bir tarihi nasıl set ederiz.
        LocalDate tarih1=LocalDate.of(2053,5,20);
        LocalDate tarih2=LocalDate.of(2053, Month.MAY,20);
        System.out.println("tarih2 = " + tarih2);
        System.out.println("tarih1 = " + tarih1);



    }
}
