package Gun21tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız sayılarla dolduracağınız 6 elemanlı(sayı) bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(liste)(ArrayList) atayarak
        // yazdırınız.
        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[6];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("bir sayı giriniz=");
            dizi[i] = oku.nextInt();

        }

        ArrayList<Integer> tekler = new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 != 0) {
                tekler.add(dizi[i]);
            }

        }
        System.out.println("tekler = " + tekler);
    }
}
