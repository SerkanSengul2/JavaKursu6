package Gun33._03_InheritanceSoru;

public class GenelMudur extends Calisan {
 private   double tazminat=15000.00;

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
       setTazminat(tazminat);
    }

    public GenelMudur(String isim, double maas, double maasKatsayisi, double tazminat) {
        super(isim, maas, maasKatsayisi);
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return super.toString()+"tazminat"+tazminat;
    }

    @Override
    public double MaasHesapla() {
      return super.MaasHesapla()+tazminat;

    }




    public GenelMudur(String isim, double maas, double maasKatsayisi) {
        super(isim, maas, maasKatsayisi);



    }
}
