package Gun15;

import java.util.Scanner;

public class _04_continue {
    public static void main(String[] args) {
        //kullanıcdan 5  sayı isteyiniz
        //bu sayılar 6-10 arasındakıier harc dıgerlerını toplasın

        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("sayı giriniz= ");
            int sayi = oku.nextInt();

            if (sayi > 6 && sayi < 10)
                continue;
            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);

    }
}
