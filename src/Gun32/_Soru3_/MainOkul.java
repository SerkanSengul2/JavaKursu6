package Gun32._Soru3_;

import java.util.Scanner;

public class MainOkul {
    public static void main(String[] args) {
        Scanner okustr=new Scanner(System.in);
        Scanner okuint=new Scanner(System.in);
        
        Okul yeniokul=new Okul("İzmir OKulu",3);
        
        do {
            System.out.print("Ogrencı adı giriniz= ");
            String ad= okustr.nextLine();
            System.out.print("Ogrencının soyadını giriniz= ");
            String soyad= okustr.nextLine();
            System.out.print("Ogrencının yasını gırınız= ");
            
            int yas= okuint.nextInt();
            if (yas<15) {
                Ogrenci ogr = new Ogrenci(ad, soyad, yas);
                yeniokul.getOgrenciler().add(ogr);
            } else
                System.out.println("Ogrecının yası uygun degıl");
            
        }while (yeniokul.ogrenciler.size()<yeniokul.getKontejyan());
        System.out.println("yeniokul.getOgrenciler() = " + yeniokul.getOgrenciler());
    }
}
