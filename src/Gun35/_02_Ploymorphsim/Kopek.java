package Gun35._02_Ploymorphsim;

public class Kopek extends Hayvan {
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("havladı");
    }

    public void kokladi() {
        System.out.println("kokladı");
    }
}
