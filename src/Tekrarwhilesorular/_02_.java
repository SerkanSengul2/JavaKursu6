package Tekrarwhilesorular;

import java.util.Scanner;

public class _02_ {
    public static void main(String[] args) {
        // Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.
        Scanner oku = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;

        while (sayac < 5) {
            System.out.print("sayı giriniz= ");
            int sayi = oku.nextInt();
            sayac++;
            if (sayi >= 10 && sayi <= 30)
                toplam = sayi + toplam;


        }
        System.out.println("toplam = " + toplam);

    }
}
