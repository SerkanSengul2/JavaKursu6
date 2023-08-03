package OdevMethodlar;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
//        "OrtaKelime" isminden bir method oluşturun.
//        Bu method String'i parametre olarak almalı.
//        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//        Ortadaki kelimeyi return yapınız.
//        Örnek: Ben Java'yı seviyorum.
//        print : Java'yı
//        Örnek2:
//        Java'yı kolayca öğreniyorum.
//        print: kolayca

        String cumle = "ben java'yı seviyorum";
        String ortakelime = ortakelime(cumle);
        System.out.println("ortakelime = " + ortakelime);

    }

    public static String ortakelime(String cumle) {
        String[] kelime =cumle.split(" ");
        int orta=kelime.length/2;
        return kelime[orta];



    }

}
