package Gun32._Soru3_;

import java.util.ArrayList;

public class Okul {
private String OkulAd;
private int kontejyan;
ArrayList<Ogrenci>ogrenciler=new ArrayList<>();

    public Okul(String okulAd, int kontejyan) {
        OkulAd = okulAd;
        this.kontejyan = kontejyan;
    }

    public String getOkulAd() {
        return OkulAd;
    }

    public void setOkulAd(String okulAd) {
        OkulAd = okulAd;
    }

    public int getKontejyan() {
        return kontejyan;
    }

    public void setKontejyan(int kontejyan) {
        this.kontejyan = kontejyan;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "OkulAd='" + OkulAd + '\'' +
                ", kontejyan=" + kontejyan +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
