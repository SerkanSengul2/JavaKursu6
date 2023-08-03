package Gun10;

import java.util.Scanner;

public class Orneksoru3 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı = ");
        int sayi1 = oku.nextInt();
        int kalan = sayi1 % 2;
        System.out.println("kalan = " + kalan);
        if (kalan == 0) {
            System.out.println("çiftir");
        } else{
            System.out.println("tektir");
        }
        //4 veya -4 : çiftlerde her zaman 0 geldi
        //5 ise 1 ,-5 ise -1 teklerde







    }



}
