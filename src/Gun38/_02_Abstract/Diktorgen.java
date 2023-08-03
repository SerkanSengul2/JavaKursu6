package Gun38._02_Abstract;

public class Diktorgen extends Sekil {
    private double kisakenar;
    private double uzunkenar;

    public double getKisakenar() {
        return kisakenar;
    }

    public void setKisakenar(double kisakenar) {
        this.kisakenar = kisakenar;
    }

    public double getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(double uzunkenar) {
        this.uzunkenar = uzunkenar;
    }

    public Diktorgen(double kisakenar, double uzunkenar) {
        setKisakenar(kisakenar);
        setUzunkenar(uzunkenar);
    }


    @Override
    double alan() {
        return this.uzunkenar * this.kisakenar;
    }

    @Override
    double cevre() {
        return (this.kisakenar + this.uzunkenar) * 2;
    }
}

