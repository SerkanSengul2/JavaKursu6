package Gun33._02_Inheritance;

public class Ordek extends Hayvan {

    private int KanatAcikligi;

    public int getKanatAcikligi() {
        return KanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        KanatAcikligi = kanatAcikligi;
    }

    @Override
    public void Konustu() {
        //super.Konustu();
        System.out.println("vakladı");
    }

    @Override
    public String toString() {
        return super.toString()+",kanatacıklıgı"+"-"+this.KanatAcikligi;
    }

    public Ordek(String renk, int kilo, String cinsi,int kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);


    }
}
