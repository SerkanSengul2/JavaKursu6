package Gun25._02_Ornek;

import Gun06._ornek01_;
//main için kullanılan dosya
public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        
        ogr1.okulno=1002;
        ogr1.adi="Serkan";
        ogr1.soyadi="Sengul";
        System.out.println("ogr1.adi = " + ogr1.adi);
        System.out.println("ogr1.soyadi = " + ogr1.soyadi);
        System.out.println("ogr1.okulno = " + ogr1.okulno);
        
        
    }

}
