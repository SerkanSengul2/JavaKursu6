package Gun38._01_Abstract;
//2 si bir arada=> 1 interface+1 parent class= abstract class
public abstract class Binekoto {

    private String marka;
    private int uretimyili;
    private int vitesAdedi;
    abstract int hizlanmasuresi();

    public Binekoto(String marka, int uretimyili, int vitesAdedi) {
    setMarka(marka);
    setUretimyili(uretimyili);
    setVitesAdedi(vitesAdedi);

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimyili() {
        return uretimyili;
    }

    public void setUretimyili(int uretimyili) {
        this.uretimyili = uretimyili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
