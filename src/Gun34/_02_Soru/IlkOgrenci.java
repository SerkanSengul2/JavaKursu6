package Gun34._02_Soru;

public class IlkOgrenci extends Ogrenci{

private String Klup;

    public String getKlup() {
        return Klup;
    }

    public void setKlup(String Klup) {
       this.Klup=Klup;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Klubu= "+this.Klup;
    }

    public IlkOgrenci(String isim,String Klup) {
        super(isim, OgrTip.ILK);
        setKlup(Klup);

    }
}


