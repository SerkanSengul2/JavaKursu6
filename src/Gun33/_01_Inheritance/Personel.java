package Gun33._01_Inheritance;

public class Personel {
    private String ad;
    private int sicilno;
    private int yas;
    private double maas;
    private String departmani;
    private String telefon;
    private int tcno;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSicilno() {
        return sicilno;
    }

    public void setSicilno(int sicilno) {
        this.sicilno = sicilno;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public void BordoYazdir() {
        System.out.println("bordo yazıldı");
    }

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", sicilno=" + sicilno +
                ", yas=" + yas +
                ", maas=" + maas +
                ", departmani='" + departmani + '\'' +
                ", telefon='" + telefon + '\'' +
                ", tcno=" + tcno +
                '}';
    }
}
