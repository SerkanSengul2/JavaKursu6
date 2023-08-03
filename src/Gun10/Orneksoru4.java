package Gun10;

import java.util.Scanner;

public class Orneksoru4 {
    public static void main(String[] args) {

        //girilen sayı pozitif ve tek ise ekrana uygun sayı gırıldı
        //degılse uygun sayı gırılmedı yazıdınız

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi = oku.nextInt();
        if (sayi>=0 && sayi%2!=0 ) {
            System.out.println("uygun");
        } else
            System.out.println("uygun degıl");



    }


}
