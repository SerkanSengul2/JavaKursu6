package ODEVjava01;

import java.awt.*;
import java.util.Scanner;

public class odevwhile03 {
    public static void main(String[] args) {

        //Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.


        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz= ");
        int sayi= oku.nextInt();
        int sayac=0;
        int toplam=0;

        while (sayac<=sayi){

            sayac=sayac+1;
            toplam=toplam+sayac;

            System.out.println("toplam = " + toplam);
        }


    }



}
