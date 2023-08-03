package Gun37._01_Soru;

public class Bus extends Vecihle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeDiesel() {
        return "1 depo ile 1000km gider.";
    }

    @Override
    public String drive() {
        return "En fazla 90km hız yapabilir.";
    }
}
