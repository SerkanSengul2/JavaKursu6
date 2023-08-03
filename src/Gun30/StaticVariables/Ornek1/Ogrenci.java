package Gun30.StaticVariables.Ornek1;

public class Ogrenci {

    String Ad;
    String Soyad;
   static String OkulAd="İzmir Okulu";//kod adı: sen bitanesin

    public Ogrenci(String ad, String soyad) {
        Ad = ad;
        Soyad = soyad;
        //Tekrarlayan ve tum nesneler için kullanılacak
        //değişkenler için STATIC kullanıyoruz.
        //static=sen bir tanesin
        //static varsa hafızadan tasarruf sağlar.
        // hepsine atanır, tek olarak hafızada bulunur
        //tipin, sınıfın, classın değişkeni oldu


    }

    public String toString() {
        return "Ogrenci{" +
                "Ad='" + Ad + '\'' +
                ", Soyad='" + Soyad + '\'' +
                ", OkulAd='" + OkulAd + '\'' +
                '}';
    }
}

