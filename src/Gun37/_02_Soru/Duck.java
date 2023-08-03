package Gun37._02_Soru;

public class Duck implements Sailing, Flying, Animal {
    @Override
    public String ucar() {
        return "göklerde ";
    }

    @Override
    public String yuzer() {
        return "fena dalar";
    }

    @Override
    public String food() {
        return "balık yer";
    }
}
