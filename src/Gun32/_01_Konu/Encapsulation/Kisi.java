package Gun32._01_Konu.Encapsulation;

public class Kisi {
     String ad;
     String soyad;
    private int yas;

    public void YasAta(int yas) {
        if (yas < 0)
            System.out.println("hatalı giriş");
        else
            this.yas = yas;
    }

    public void Setad(String ad) {
        if (ad.length() < 25)
            this.ad = ad;
        else
            System.out.println("hatalı giriş");
    }

    public void SetSoyad(String soyad) {
        if (soyad.length() < 25)
            this.soyad = soyad;
        else
            System.out.println("hatalı giriş");
    }

    public int yasVer() {
        return this.yas;
    }

    public String GetSoyAd() {
        return this.soyad;

    }

    public String GetAd() {
        return this.ad;
    }
}
