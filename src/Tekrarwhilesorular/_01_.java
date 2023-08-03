package Tekrarwhilesorular;

import java.util.Scanner;

public class _01_ {
    public static void main(String[] args) {
        //Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner oku = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;


        while (sayac<5){
            System.out.print("sayı giriniz= ");
            sayac++;
            int sayi= oku.nextInt();
            if (sayi%2==1)
            toplam=sayi+toplam;

        }
        System.out.println("toplam = " + toplam);
    }



}
