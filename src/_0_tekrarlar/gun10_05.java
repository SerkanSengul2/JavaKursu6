package _0_tekrarlar;

import java.awt.*;
import java.util.Scanner;

public class gun10_05 {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku = new Scanner(System.in);
        System.out.print("Şifre giriniz= ");
        String sifre = oku.nextLine();
        if (sifre.length() > 8 && !sifre.contains("pass") && sifre.length() < 13) {
            System.out.println("doğru");
        } else
            System.out.println("hatalı");


    }


}
