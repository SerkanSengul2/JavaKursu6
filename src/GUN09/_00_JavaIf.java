package GUN09;

import java.util.Scanner;

public class _00_JavaIf {
    public static void main(String[] args) {

        //baklava dilimimiz : if
        //girilen bir sayı 10dan büyük ise ekrana 10 büyük yazdırınız.

        // 1 basla
        // 2 sayı oku sayi=oku.nextInt();
        // 3 sayi>10 ise "10 dan büyük" yaz if (sayi>10) sout..
        // 4 dur

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi=");
        int sayi = oku.nextInt();
        if (sayi > 10) {
            System.out.println("10 dan büyük");
        }
        if (sayi < 10) {
            System.out.println("10 dan küçük");
        }
        if (sayi==10) {
            System.out.println("eşittir");
        }





             //{} parantezlerini her zaman kullanabılırsınız
            // ancak if şartı sağlandığında çalışacak tek bir komut var ise
            //kullanmak zorunlu değildir.



    }


}
