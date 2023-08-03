package Gun36._06_OrnekSoru;

public class GeoMain {
    public static void main(String[] args) {
        Diktortgen d=new Diktortgen();
        System.out.println("diktorgenın alanı= "+d.alan(5,6));
        System.out.println("diktorgernın cevresı= "+d.cevre(5,6));
        Kare k=new Kare();
        System.out.println("karenin alanı= "+k.alan(5));
        System.out.println("karenin cevresi="+k.cevre(5));
    }
}
