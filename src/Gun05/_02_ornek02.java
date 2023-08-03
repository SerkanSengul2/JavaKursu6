package Gun05;

import java.util.Scanner;

public class _02_ornek02 {
    public static void main(String[] args) {

//girilen bir adı ekrana yazıdınız

        Scanner okuyucu = new Scanner(System.in);
        System.out.print("isim giriniz=");

        String okunanIsim = okuyucu.next();//next kelime oku
        System.out.println("okunanIsim="+ okunanIsim);
        System.out.println("bitti");

       /*
          okuyucu.next()     -> bir kelime okur
          okuyucu.nextLine() -> tüm satırı okur cumle gibi

          okuyucu.nextInt()  -> bir tam sayı(int)
          okuyucu.nextShort() -> bir tam sayı(short)
          okuyucu.nextByte() -> bir tam sayı(byte)
          okuyucu.nextLong() -> bir tam sayı(long)

          okuyucu.nextDouble() -> bir ondalıklı sayı(double)
          okuyucu.nextFloat() -> bir ondalıklı sayı(float)

          okuyucu.nextBoolean() -> true veya false girişi için
         */

    }


}
