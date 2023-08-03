package Gun37._02_Soru;

public class Swallow implements Flying,Animal{
    @Override
    public String ucar() {
        return "suda yüzer,gökyüzünde uçar";
    }

    @Override
    public String food() {
        return "genelikle balık";
    }
}
