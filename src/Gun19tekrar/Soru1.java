package Gun19tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız

        int tekmik = 0;
        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("sayı giriniz= ");
                tablo[i][j] = oku.nextInt();
                if (tablo[i][j] % 2 == 1) {
                    tekmik++;
                }

            }
        }
        int[] tekler = new int[tekmik];
        int tekmikIndex = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (tablo[i][j] % 2 == 1) {
                    tekler[tekmikIndex] = tablo[i][j];
                    tekmikIndex++;
                }

            }

        }
        System.out.println(Arrays.toString(tekler));

    }


}
