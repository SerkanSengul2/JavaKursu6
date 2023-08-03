package Gun14;

import java.util.Scanner;

public class _02_doWhile {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;


        do {
            System.out.print("sayi giriniz= ");
            sayi = oku.nextInt();
            toplam = sayi + toplam;


        }while (sayi != 0) ;

        System.out.println("toplam = " + toplam);

    }}//sayı 0 degıl ise bunu yap demek oluyor.
//döngü bir kez calıscak ve sonda kontrol edilecek