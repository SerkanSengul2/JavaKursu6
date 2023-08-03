package _0_tekrarlar;

import java.util.Scanner;

public class Gun1101 {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan küçük olanını bulunuz


        Scanner oku = new Scanner(System.in);
        System.out.print("a değeri= ");
        int a = oku.nextInt();
        System.out.print("b değeri= ");
        int b= oku.nextInt();
        System.out.print("c değeri= ");
        int c= oku.nextInt();

        System.out.println("En küçük değer= "+Math.min(a,Math.min(b,c)));


    }


}
