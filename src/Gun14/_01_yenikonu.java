package Gun14;

import java.util.Scanner;

public class _01_yenikonu {
    public static void main(String[] args) {
//kullanıcı 0 degerı gırıne kadar        
        //gırıdıgı sayıların toplanı bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi = oku.nextInt();// ilk adım için dışarı aldık
        int toplam = 0;


        while (sayi != 0) { //döngünün dönme şartı girilene kadar 0 dan farklı olucak
            System.out.print("sayi giriniz= ");
            sayi = oku.nextInt();
            toplam = sayi + toplam;
        }
        System.out.println("toplam = " + toplam);
    }


}



