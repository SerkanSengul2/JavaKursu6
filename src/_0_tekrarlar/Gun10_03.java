package _0_tekrarlar;

import java.util.Scanner;

public class Gun10_03 {
    public static void main(String[] args) {

        //girilen sayı pozitif ve tek ise ekrana uygun sayı gırıldı
        //degılse uygun sayı gırılmedı yazıdınız

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz= ");
        int sayi = oku.nextInt();
        if (sayi > 0 && sayi % 2 == 1) {
            System.out.println("uygundur");
        }
        else
            System.out.println("uygun degildir");


    }


}
