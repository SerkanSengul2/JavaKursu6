package Gun26.ornek.soru;

public class Kampus {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.Okulno = 1001;
        ogr1.ad = "serkan";
        ogr1.soyad = "Sengul";
        //Ogr1.okulAd="Bayrak okulu";


        ogr1.okul.okulAd = "Muğla universitesi";
        ogr1.okul.okulMuduru = "Kerem Dizdar";
        ogr1.okul.adres = "Yalı vadisi/İstanbul";

        System.out.println("ogr1.ad = " + ogr1.ad);
        System.out.println("ogr1.okul.okulAd = " + ogr1.okul.okulAd);






    }
}
