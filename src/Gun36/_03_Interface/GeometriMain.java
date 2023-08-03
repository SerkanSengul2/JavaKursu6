package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c = new Cember();
        c.ciz();
        Diktortgen d = new Diktortgen();
        d.ciz();

        //interface lerden nesne uretılmez fakat referans tipi,
        //oluşturalabilir. bu bize Polymorphism sağlar.
        ICizdirir c2 = new Cember();
        c2.ciz();
        //direkt olarak sadece interface deki
        //isim verilmiş olanlar metodlara erişebilir.

        cizdir(c);
        cizdir(d);


    }

    public static void cizdir(ICizdirir g) {
        g.ciz();
    }
}
