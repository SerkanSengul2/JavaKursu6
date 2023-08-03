package Gun28.ornek04;

public class insan {
    public static void main(String[] args) {
        Musteri mus1=new Musteri("ismet");

        mus1.elektrikHesabi.tuketimEkle(50);
        mus1.elektrikHesabi.tuketimEkle(60);
        mus1.elektrikHesabi.tuketimEkle(70);

        System.out.println("toplamTuketim = " +
                mus1.elektrikHesabi.toplamTuketim);

        mus1.elektrikHesabi.faturaYaz();


    }
}
