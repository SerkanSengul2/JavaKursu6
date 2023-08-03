package Gun33._03_InheritanceSoru;

public class Calisan {
    private String isim;
    private double maas;
    private double maasKatsayisi = 2.2;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(double maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }

    public Calisan(String isim, double maas, double maasKatsayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatsayisi(maasKatsayisi);
    }

    public double MaasHesapla() {
       return maas*maasKatsayisi;

    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
}

