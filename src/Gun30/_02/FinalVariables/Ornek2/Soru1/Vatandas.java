package Gun30._02.FinalVariables.Ornek2.Soru1;

public class Vatandas {

    String isim;
    String adres;
    final int TcNo;

    private  static int sayac=1;


    public Vatandas(String isim,String adres){
        this.isim=isim;
        this.adres=adres;
        this.TcNo=sayac+=5;
    }


    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", TcNo=" + TcNo +
                '}';
    }
}
