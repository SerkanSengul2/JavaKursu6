package GUN09;

import java.util.Scanner;

public class Orneksoru1 {
    public static void main(String[] args) {

        //girilen bir sayının tek sayı olup olmadıgını yazdırınız?


        Scanner oku = new Scanner(System.in);
        System.out.print("sayı = ");
        int sayi1 = oku.nextInt();
        int kalan = sayi1 % 2; // 1 ise tektir
        System.out.println("tek mi=" + (kalan == 1));




    }


}
