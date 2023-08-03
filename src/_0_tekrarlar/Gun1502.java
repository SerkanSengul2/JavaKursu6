package _0_tekrarlar;

import java.util.Scanner;

public class Gun1502 {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // carpimin degeri 10000 ü geçtiğinde işlem sonlansın.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz= ");
        int sinir = oku.nextInt();
        int carpim = 1;
        for (int i = 1; i < sinir; i++) {

            carpim = carpim * i;
            System.out.println("sinir" + carpim + "*" + i);
            if (carpim > 10000) {

                break;
            }
        }

        System.out.println("carpim = " + carpim);
    }


}
