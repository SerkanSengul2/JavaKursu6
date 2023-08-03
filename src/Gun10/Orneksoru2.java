package Gun10;

import java.util.Scanner;

public class Orneksoru2 {
    public static void main(String[] args) {

        //Girilen bir sayının tek mi çift mi oldugunu yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı = ");
        int sayi1 = oku.nextInt();
        int kalan = sayi1 % 2;
        if (kalan == 1) {
            System.out.println("tektir");
        } else
            System.out.println("çifttir");


    }


}
