package _0_tekrarlar;

import java.util.Scanner;

public class Gun0504 {
    public static void main(String[] args) {

// Kullanıcıdan ağırlığını(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)

        Scanner oku=new Scanner(System.in);
        System.out.print("kilosu(kg)= ");
        double kilosu= oku.nextDouble();
        System.out.print("boyu(m)=");
        double boyu=oku.nextDouble();
        double KITLEINDEX=kilosu/(boyu*boyu);
        System.out.println("kilosu = " + kilosu);
        System.out.println("boyu = " + boyu);
        System.out.println("KITLEINDEX = " + KITLEINDEX);




    }





}
