package _0_tekrarlar;

import java.awt.*;
import java.util.Scanner;

public class Gun0503 {
    public static void main(String[] args) {

        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan
        //isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b

        Scanner oku = new Scanner(System.in);
        System.out.print("uzunkenar= ");
        int a = oku.nextInt();
        System.out.print("kısakenar= ");
        int b = oku.nextInt();
        int cevre=a+b+a+b;
        int alan=a*b;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);



    }


}
