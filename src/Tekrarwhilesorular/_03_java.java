package Tekrarwhilesorular;

import java.util.Scanner;

public class _03_java {
    public static void main(String[] args) {
//        bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
//        Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
//        bilemediniz yazıp tutulan sayıyı bildirsin.
//        Eğer bilirse tebrikler yazsın.

        Scanner oku = new Scanner(System.in);
        int sayac = 0;
        int sayi2 = (int) (Math.random() * (20 - 10) + 10);

        while (sayac < 3) {
            System.out.print("sayı giriniz= ");
            int sayi = oku.nextInt();
            if (sayi == sayi2) {
                System.out.println("bildiniz");
                break;
            } else

                System.out.println("tekrar deneyiniz");
            sayac++;


            if (sayi == 3) {

            }
        }
        System.out.println("randomsayı= " + sayi2);


    }
}
