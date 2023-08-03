package Gun38._02_Abstract;

public abstract class Sekil {

    private String name;

    abstract double alan();

    abstract double cevre();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "\nName=" + name +
                "\nAlan =" + alan() +
                "\nCevre= " + cevre();

    }

    public void ciz() {
        System.out.println(name + "Sekli cizildi");


    }

}



