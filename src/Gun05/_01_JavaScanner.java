package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        //tipi adı başlangıç değeri
        //int sayi = 5;

        Scanner okuyucu = new Scanner(System.in);
        //tipi    adı     yeni bir okuyucu oluşturuldu(klayvede/konsoldan)

        System.out.print("sayı giriniz=");
        int okunan = okuyucu.nextInt(); //klavyeden girilen tam sayı oku

//rakam girilip enter a basıldıgında değeri alıp okunan atıyor.
        System.out.println("okunan=" + okunan);
        System.out.println("bitti");


    }


}
