package Gun11;

import java.util.Scanner;

public class Orneksoru03 {
    public static void main(String[] args) {

//girilen sayı 50den buyuk ise 1degılse 0 degıerını yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi = oku.nextInt();
        int sonuc = (sayi > 50) ? 1 : 0;
        System.out.println("sonuc = " + sonuc);


    }


}
