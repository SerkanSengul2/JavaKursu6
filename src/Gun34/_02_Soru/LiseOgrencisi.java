package Gun34._02_Soru;


public class LiseOgrencisi extends Ogrenci {

    private String Brans;

    public String getBrans() {
        return Brans;
    }

    public void setBrans(String Brans) {
        this.Brans = Brans;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Bransı= " + this.Brans;
    }

    public LiseOgrencisi(String isim, String Brans) {
        super(isim, OgrTip.LISE);
        setBrans(Brans);


    }
}







