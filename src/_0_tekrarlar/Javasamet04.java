package _0_tekrarlar;

import java.util.Scanner;

public class Javasamet04 {
    public static void main(String[] args) {
        //        Bileşenlere göre dizüstü bilgisayar fiyatını hesaplayan bir program yazınız.
//                Önce kullanıcıdan bir ekran boyutu isteyin.
//                -Ekran boyutu 13.3 ise laptop fiyatına 200$ ekleyin.
//        -Ekran boyutu 15.0'a eşitse - dizüstü bilgisayar fiyatına 300 $ ekleyin.
//                -Ekran boyutu 17.3'e eşitse - dizüstü bilgisayar fiyatına 400 $ ekleyin.
//        Ardından kullanıcıdan CPU tipini isteyin.
//                -CPU tipi i3'e eşitse, dizüstü bilgisayar fiyatına 150 $ ekleyin.
//                -CPU tipi i5'e eşitse, dizüstü bilgisayar fiyatına 250 $ ekleyin.
//                -CPU tipi i7'ye eşitse, dizüstü bilgisayar fiyatına 350 $ ekleyin.
//        Ardından kullanıcıdan RAM boyutunu isteyin.
//                -Dizüstü bilgisayar fiyatına her 4 GB ram için 50 ABD doları ekleyin.
//                Ardından, kullanıcıdan depolama tipini isteyin. 2 seçenek vardır: SSD ve HDD.
//                - HDD ise - her 500 gb için dizüstü bilgisayar fiyatına 50 $ ekleyin.
//        -SSD ise - her 500GB için dizüstü bilgisayar fiyatına 100$ ekleyin.
//        Ardından kullanıcıdan ekran çözünürlüğünü isteyin. 2 seçenek vardır: FULLHD ve 4K.
//                -FULLHD ekran ise 100 $ ekleyin
//        -4K ise 200$ ekleyin


        Scanner oku = new Scanner(System.in);
        Scanner oku2 = new Scanner(System.in);
        System.out.print("Ekran boyutu= ");
        double ekranboyutu = oku.nextDouble();
        double bilgisayar = 0;
        if (ekranboyutu == 13.3) {
            bilgisayar = bilgisayar + 200;
            System.out.println(bilgisayar);
        } else if (ekranboyutu == 15) {
            bilgisayar = bilgisayar + 300;
            System.out.println(bilgisayar);
        } else if (ekranboyutu == 17.3) {
            bilgisayar = bilgisayar + 400;
            System.out.println(bilgisayar);
        }
        System.out.print("CPU tipi= ");
        String Cpu = oku.next();

        if (Cpu.equalsIgnoreCase("i3")) {
            System.out.println(bilgisayar += 150);
        } else if (Cpu.equalsIgnoreCase("i5")) {
            System.out.println(bilgisayar += 250);
        } else if (Cpu.equalsIgnoreCase("engin")) {
            System.out.println(bilgisayar += 350);
        }


        System.out.print("Ram boyu iste= ");
        double ramboyu = oku.nextDouble();
        System.out.println(bilgisayar += (ramboyu / 4) * 50);


        System.out.print("Depolama tipi= ");
        String depolama = oku.next();


        System.out.print("GB giriniz= ");
        double hdd = oku2.nextDouble();

        if (depolama.equalsIgnoreCase("HDD")) {

            bilgisayar += (hdd / 500) * 50;
            System.out.println(bilgisayar);


        } else
            System.out.println(bilgisayar += (hdd / 100) * 50);


        System.out.print("ekran cozunurlugu gir= ");
        String co= oku.next();
        if (co.equalsIgnoreCase("fullhd")){
            System.out.println(bilgisayar+=100);

        }
else
            System.out.println(bilgisayar+=200);
    }


}




