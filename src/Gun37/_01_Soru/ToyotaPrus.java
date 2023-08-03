package Gun37._01_Soru;

public class ToyotaPrus extends Vecihle implements IElectric,IGas{
    public ToyotaPrus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeBattery() {
        return "ömür boyu";
    }

    @Override
    public String Changeoil() {
        return "bir depo ile 300km gider";
    }

    @Override
    public String drive() {
        return "ilk 3km elektrikle gider";
    }
}
