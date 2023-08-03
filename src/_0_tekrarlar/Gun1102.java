package _0_tekrarlar;

import java.util.Scanner;

public class Gun1102 {
    public static void main(String[] args) {
        //otopark ücretleri;
//3 saate 10 tl 5 saate kadar 15tl 5den buyukse 20 tl
//kullanıcadn kac saat kaldıgını ucretını yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int saat = oku.nextInt();
        if (saat <= 3) {
            System.out.println("10tl");
        } else if (saat <= 5) {
            System.out.println("15tl");
        } else
            System.out.println("20tl");
    }


}
