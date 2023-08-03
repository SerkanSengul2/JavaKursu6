package _0_tekrarlar;

import java.util.Scanner;

public class Gun0501 {
    public static void main(String[] args) {
// Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı1=");
        int s1 = oku.nextInt();
        System.out.print("sayı2=");
        int s2 = oku.nextInt();
        int toplam=s1+s2;
        System.out.println("toplam = " + toplam);



    }


}
