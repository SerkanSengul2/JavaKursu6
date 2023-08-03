package ODEVjava01;

import java.util.Scanner;

public class odevwhile01 {
    public static void main(String[] args) {
        //Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner oku = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;


        while (sayac < 5) {
            System.out.print("sayı giriniz= ");
            int sayi = oku.nextInt();
            sayac = sayac + 1;
            if (sayi % 2 == 1) {
                toplam = toplam + 1;

            }


        }

        System.out.println("toplam = " + toplam);
    }


}


