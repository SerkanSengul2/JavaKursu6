package _0_tekrarlar;

import java.util.Scanner;

public class gun0902 {
    public static void main(String[] args) {
        //giirlen bir sayının negatrif mi pozıif mi oldugunu yazdıdınız
        //sıfır ise sıfır yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi = oku.nextInt();
        if (sayi > 0) {
            System.out.println("poizitif yaz");
        }
        if (sayi < 0) {
            System.out.println("negatif yaz");
        }
        if (sayi == 0) {
            System.out.println("sıfır yaz");
        }

    }


}
