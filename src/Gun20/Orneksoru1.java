package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class Orneksoru1 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("sayı giriniz= ");
            dizi[i] = oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi));
        enbuyukyaz(dizi);
        enkucukyaz(dizi);
        ortalamayaz(dizi);
    }

    public static void enbuyukyaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("enbüyükelaman = " + dizi[dizi.length - 1]);//sondaki

    }

    public static void enkucukyaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("enkucukelaman = " + dizi[0]);//baştaki

    }

    public static void ortalamayaz(int[] dizi) {
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam = toplam + dizi[i];
        }
        double ort = toplam / dizi.length;
        System.out.println("ort = " + ort);
    }


}

