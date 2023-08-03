package Gun19tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        //Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int[3][2];
        int tekMik=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Sayi giriniz=");
                tablo[i][j]=oku.nextInt();
                if (tablo[i][j] % 2 == 1)
                    tekMik++;
            }
        }
        int[] tekler=new int[tekMik];

        int teklerIndex=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (tablo[i][j]%2 == 1) {
                    tekler[teklerIndex]=tablo[i][j];
                    teklerIndex++;
                }
            }
        }

        System.out.println(Arrays.toString(tekler));
    }
}

