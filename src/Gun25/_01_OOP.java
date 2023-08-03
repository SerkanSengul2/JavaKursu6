package Gun25;


//class-tiplerin tanımlandıgı yer

public class _01_OOP {

    public static void main(String[] args) {
        ogrenci ogr1 = new ogrenci();
        ogr1.okulno=1001;
        ogr1.adi="Serkan";
        ogr1.soyadi="Sengul";
        ogr1.sinifi= 11;
        ogr1.adrei="izmir";
        ogr1.telefonu="0555555555";
        System.out.println("ogr1.telefonu = " + ogr1.telefonu);
        System.out.println("ogr1.adrei = " + ogr1.adrei);

    }
}
class ogrenci {

    int okulno;
    String adi;
    String soyadi;
    int sinifi;
    String adrei;
    String telefonu;
}

