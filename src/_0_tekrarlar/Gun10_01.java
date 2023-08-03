package _0_tekrarlar;

import java.util.Scanner;

public class Gun10_01 {
    public static void main(String[] args) {
        //kullanıcan 2 kez gircegi şifre aynı olup olmadıgını aynı veya degıl cevaplayınız

        Scanner oku = new Scanner(System.in);
        System.out.print("şifre1 gir= ");
        String s1 = oku.nextLine();
        System.out.print("şifre2 gir= ");
        String s2 = oku.nextLine();
        if (s1.equals(s2)) {
            System.out.println("doğru yaz");
        } else
            System.out.println("hatalı yaz");


    }


}
