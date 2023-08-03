package Gun35._03_Soru;

public class Calisan extends Kisi {
   private String departmani;

    public Calisan(String ad, String soyad, String gorevi, String departmani) {
        super(ad, soyad, gorevi);
        this.departmani = departmani;
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }




    public Calisan(String ad, String soyad, String gorevi) {
        super(ad, soyad, gorevi);


    }
}
