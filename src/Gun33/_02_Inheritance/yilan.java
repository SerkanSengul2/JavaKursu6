package Gun33._02_Inheritance;

public class yilan extends Hayvan {
    private int uzunluk;

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public void Konustu() {
        // super.Konustu();
        System.out.println("tısladı");
    }

    @Override
    public String toString() {
        return super.toString()+",uzunluk"+"-"+this.uzunluk;
    }

    public yilan(String renk, int kilo, String cinsi, int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);


    }


    }

