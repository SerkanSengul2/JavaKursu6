package Gun35._03_Soru;

public class Ogrenci extends Kisi {
    private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi, String subesi) {
        super(ad, soyad, gorevi);
        this.subesi = subesi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }




    public Ogrenci(String ad, String soyad, String gorevi) {
        super(ad, soyad, gorevi);


    }
}


