package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class Orneksoru1 {
    public static void main(String[] args) {
        //Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.
        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[3][2];
        int teksayi = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("bir sayı giriniz=");
                tablo[i][j] = oku.nextInt();
                if (tablo[i][j] % 2 == 1) {
                    teksayi++;
                }
            }

        }
        int[] tekindx = new int[teksayi];
        int tekler = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (tablo[i][j] % 2 == 1) {
                    tekindx[tekler] = tablo[i][j];

                    tekler++;
                }
            }

        }
        System.out.println(Arrays.toString(tekindx));
    }

}












































