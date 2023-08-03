package Gun32._02_Soru;

public class Araba {

    private String renk;
    private int model;
    private int MotorHacmi;
    private int Kapisayisi;

    public Araba() {

    }

    public Araba(String renk, int model, int motorHacmi, int kapisayisi) {
//        this.renk = renk;
//        this.model = model;
//        MotorHacmi = motorHacmi;
//        Kapisayisi = kapisayisi;

        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapisayisi(kapisayisi);
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", MotorHacmi=" + MotorHacmi +
                ", Kapisayisi=" + Kapisayisi +
                '}';
    }

    public String getRenk(String renk) {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel(int Model) {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getMotorHacmi(int MotorHacmi) {
        return MotorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        MotorHacmi = motorHacmi;
    }

    public int getKapisayisi(int Kapisayisi) {
        return Kapisayisi;
    }

    public void setKapisayisi(int kapisayisi) {
        if (kapisayisi < 7)
            System.out.println("hatalı giriş");
        else
            Kapisayisi = kapisayisi;
    }
}