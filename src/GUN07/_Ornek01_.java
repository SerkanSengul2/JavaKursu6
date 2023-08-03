package GUN07;

import java.util.Scanner;

public class _Ornek01_ {
    public static void main(String[] args) {

        //tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp
        //ayrı ayrı yazdırınız(sadece ad ve soyad)

        Scanner oku =new Scanner(System.in);
        System.out.print("adınız ve soyadınız= ");
        String adsoyad=oku.nextLine();
        //0-bosluk indexine kadar desem=adı
        //boslugun indexi+1 den sonuna kadar desem:soyadı verir
        int boslukIndex=adsoyad.indexOf(" ");
        String ad=adsoyad.substring(0,boslukIndex);
        String soyad=adsoyad.substring(boslukIndex+1);
        System.out.println("soyad = " + soyad);
        System.out.println("ad = " + ad);

        







    }



}
