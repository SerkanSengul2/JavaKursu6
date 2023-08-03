package ODEVjava01;

import java.util.Scanner;

public class odevwhile05 {
    public static void main(String[] args) {
        // 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.



        int sayac = 0;
        int sayi = 0;

        while (sayac < 200) {

            if (sayac % 10 == 5) {
                sayi++;

            }
            sayac++;


        }
        System.out.println("sayi = " + sayi);

    }


}
