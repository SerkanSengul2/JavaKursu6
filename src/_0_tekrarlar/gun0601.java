package _0_tekrarlar;

import java.util.Scanner;

public class gun0601 {
    public static void main(String[] args) {
        //girilen bir ad soyadı "serkan şengül" S.Ş. şeklinde yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("isim soyisim giriniz= ");
        String adsoyad = oku.nextLine();
        int bosluk = adsoyad.indexOf(" ");
        char ad = adsoyad.toUpperCase().charAt(0);
        char soyad = adsoyad.toUpperCase().charAt(bosluk + 1);
        System.out.println(ad + "." + soyad);


    }


}
