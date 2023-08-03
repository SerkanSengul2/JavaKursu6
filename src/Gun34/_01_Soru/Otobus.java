package Gun34._01_Soru;

public class Otobus extends Arac{
  int YolcuKapasitesi;

    public Otobus(String renk, int motorHacmi, String marka, int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return YolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        YolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return super.toString()+"yolcu kapasitesi= "+getYolcuKapasitesi();
    }

    public Otobus(String renk, int motorHacmi, String marka) {
        super(renk, motorHacmi, marka);


    }
}
