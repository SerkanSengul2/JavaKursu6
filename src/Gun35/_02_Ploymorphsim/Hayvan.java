package Gun35._02_Ploymorphsim;

public class Hayvan {
    private String name;

    public String getName() {
        return name;
    }

    public void ses() {
        System.out.println("ses cıkar");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hayvan(String name) {
        this.name = name;
    }
}
