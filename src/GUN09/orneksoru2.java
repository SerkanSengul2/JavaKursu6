package GUN09;

import java.util.Scanner;

public class orneksoru2 {
    public static void main(String[] args) {
//giirlen bir sayının negatrif mi pozıif mi oldugunu yazdıdınız
//sıfır ise sıfır yazdırınız

//!!!!!!!!PARANTEZLERİ HER ZAMAN KONTROL ET!!!!!!!!!

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi = oku.nextInt();

        if (sayi > 0) {
            System.out.println("pozitif yaz");
        }
        if (sayi < 0) {
            System.out.println("negatif yaz");
        }
        if (sayi==0) {
            System.out.println("eşittir yaz");
        }

    }



}
