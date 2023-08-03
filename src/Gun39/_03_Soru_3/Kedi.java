package Gun39._03_Soru_3;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumtarihi) {
        super(isim, vahsi, dogumtarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("whiskas yer");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("1 cay bardagı");
    }

    @Override
    public void gunlukUykusu() {
        System.out.println("en az 10 saat");
    }

    @Override
    public void Sesi() {
        System.out.println("miyav");
    }
}
