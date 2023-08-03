package Gun28.ornek01;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinif;

    public Ogrenci() {
        System.out.println("nesne oluşturuldu");
    }

    public Ogrenci(int id, String ad, String soyad, int sinif) {

        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
    }

    public Ogrenci(int id, String ad, String soyad){
        this(id, ad, soyad,0);
    }


//        this.id=id;
//        this.ad=ad;
//        this.soyad=soyad;



}

