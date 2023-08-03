package Gun15;

import java.util.Scanner;

public class _02_forloop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // carpimin degeri 10000 ü geçtiğinde işlem sonlansın.

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayı giriniz= ");
        int sinir = oku.nextInt();
        int carpim = 1;
        for (int i = 1; i < sinir; i++) {
            System.out.print("carpim = " + carpim + "*" + i);
            carpim = carpim * i;
            System.out.println("-> " + carpim);
            if (carpim > 10000) {
                break;
            }

        }


    }


}
