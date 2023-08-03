package _0_tekrarlar;

import java.util.Scanner;

public class gun0904 {
    public static void main(String[] args) {
        //girilen bir cümledeki küçük veya büyük a harfini olup olmadıgını
        //var ve yok şeklinde yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.println("cümle giriniz= ");
        String cumle = oku.nextLine();
        boolean Varmi = cumle.toLowerCase().contains("a");
        if (cumle.contains("a")) {
            System.out.println("dogru");
        } else
            System.out.println("yok");


    }


}
