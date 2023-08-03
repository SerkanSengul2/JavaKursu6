package Gun35._02_Ploymorphsim;

public class Kedi extends Hayvan {

    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("miyavladı");
    }
    public void tirmaladi() {
        System.out.println("tırmaladı");



    }
}
