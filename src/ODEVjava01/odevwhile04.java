package ODEVjava01;

import java.util.Scanner;

public class odevwhile04 {
    //Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayac = 0;
        int toplam = 0;
        while (sayac < 20) {
            int sayi = oku.nextInt();
            sayac++;
            if (sayi >= 10 && sayi <= 30) {
                toplam=sayi+toplam;
            }
            System.out.println("son toplam yaz = " + toplam);

        }


    }
}
