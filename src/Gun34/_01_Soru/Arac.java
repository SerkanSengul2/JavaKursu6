package Gun34._01_Soru;

public class Arac {
    private String renk;
    private int MotorHacmi;
    private String marka;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorHacmi() {
        return MotorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        MotorHacmi = motorHacmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Arac(String renk, int motorHacmi, String marka) {
        setRenk(renk);
        setMarka(marka);
        setMotorHacmi(motorHacmi);
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", MotorHacmi=" + MotorHacmi +
                ", marka='" + marka + '\'' +
                '}';
    }
}

