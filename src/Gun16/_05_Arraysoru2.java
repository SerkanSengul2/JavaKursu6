package Gun16;

import java.util.Scanner;

public class _05_Arraysoru2 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.


        int[] sayi = new int[7];
        Scanner oku = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < sayi.length; i++) {
            System.out.print((i + 1) + ".sayı giriniz= ");
            sayi[i] = oku.nextInt();
            toplam = toplam + sayi[i];


        }
        int miktar = 0;
        int ort = toplam / sayi.length;


        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] > ort && sayi[i] % 2 == 1)

            miktar++;

        }

        System.out.println("miktar = " + miktar);
        System.out.println("ort = " + ort);

    }
}
