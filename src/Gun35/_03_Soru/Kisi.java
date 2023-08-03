package Gun35._03_Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorevi = gorevi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }


    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;

    }

    public static void KimlikBelgesiYazdir(Kisi gelenKisi) {
        System.out.println("\n******Kimlik Belgesi******");
        System.out.println("ad= " + gelenKisi.getAd());
        System.out.println("soyadı= " + gelenKisi.getSoyad());
        System.out.println("Gorevi= " + gelenKisi.getGorevi());

        if (gelenKisi instanceof Calisan)
            System.out.println("Gorevi= " + ((Calisan) gelenKisi).getDepartmani());

        else
            System.out.println("Subesi= " + ((Ogrenci) gelenKisi).getSubesi());


    }
}

