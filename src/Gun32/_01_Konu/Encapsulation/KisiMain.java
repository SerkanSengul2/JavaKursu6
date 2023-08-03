package Gun32._01_Konu.Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
//        kisi1.ad = "Serkan";
//        kisi1.soyad = "Sengul";
//        kisi1.yas = -33;
        kisi1.Setad("Serkan");
        kisi1.SetSoyad("Sengul");
        kisi1.YasAta(33);
        System.out.println(kisi1.GetAd());
        System.out.println(kisi1.GetSoyAd());
        System.out.println(kisi1.yasVer());
        //degişkene direkt erişim kapatıp
        //bir metod ile korumalı veri gonderme ve alma
        //işlemine Encapsulation denir


    }
}
