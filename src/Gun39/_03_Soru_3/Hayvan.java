package Gun39._03_Soru_3;

public abstract class Hayvan {
    private static int NextID = 1;
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumtarihi;

    public abstract void yiyecegi();

    public abstract void yemekMiktari();

    public abstract void gunlukUykusu();

    public abstract void Sesi();

    public int getId() {
        return id;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                ", isim='" + this.isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumtarihi='" + dogumtarihi + '\'' +
                '}';
    }

    public Hayvan(String isim, boolean vahsi, String dogumtarihi) {
        setDogumtarihi(dogumtarihi);
        this.id = NextID++;
        setIsim(isim);
        setVahsi(vahsi);

    }
}
