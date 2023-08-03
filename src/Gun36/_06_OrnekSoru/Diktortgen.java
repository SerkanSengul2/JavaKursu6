package Gun36._06_OrnekSoru;

public class Diktortgen implements IGeometri {
    @Override
    public int alan(int kisakenar, int uzunkenar) {
        return kisakenar * uzunkenar;
    }

    @Override
    public int cevre(int kisakenar, int uzunkenar) {
        return (kisakenar + uzunkenar) * 2;
    }
}
