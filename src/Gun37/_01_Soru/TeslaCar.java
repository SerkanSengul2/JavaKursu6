package Gun37._01_Soru;

public class TeslaCar extends Vecihle implements IElectric {


    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeBattery() {
        return "dokuz yıl ömrü var";
    }

    @Override
    public String drive() {
        return "auto pilot";
    }
}

