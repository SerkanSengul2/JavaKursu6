package Gun39._03_Soru_3;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumtarihi) {
        super(isim, vahsi, dogumtarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("kucuk hayvanlar");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("kafasına gore,acıkınca yer");
    }

    @Override
    public void gunlukUykusu() {
        System.out.println("6 saat uyur");
    }

    @Override
    public void Sesi() {
        System.out.println("wiiik");
    }
}
