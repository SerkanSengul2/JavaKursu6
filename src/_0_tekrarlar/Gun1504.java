package _0_tekrarlar;

import java.util.Scanner;

public class Gun1504 {
    public static void main(String[] args) {

        //kullanıcıdan 5 sayı isteyin
        //bu sayılardan 6 ile 10 arasındakiler hariç,
        // diğerlerini toplasın ekrana yazsın

        Scanner oku = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("sayi giriniz= ");
            int sayi = oku.nextInt();

            if (sayi >= 6 && sayi <= 10) {
                continue;

            }

            toplam=toplam+sayi;
        }

        System.out.println("toplam = " + toplam);
    }


}
