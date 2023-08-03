package Gun29._03_Protected._Paket1;

public class Doktor {

    public String HastaneAd;//diğer paketlerden erişim izni verilid
    String Adi;//default
    protected String Bolumu;//default ile aynı
     private String SicilNo;//sadece class'ın ıcınden erısılebilir.


    Doktor(){//sadece kendi paketindekiler erişebilir.

    }

    public Doktor(String hastaneAd) {
        HastaneAd = hastaneAd;
    }


}
