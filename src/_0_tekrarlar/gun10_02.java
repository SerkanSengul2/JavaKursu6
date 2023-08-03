package _0_tekrarlar;

import java.util.Scanner;

public class gun10_02 {
    public static void main(String[] args) {

        //Girilen bir sayının tek mi çift mi oldugunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi= oku.nextInt();
        if (sayi%2==1){
            System.out.println("tektir");
        }
    if (sayi%2==0){
        System.out.println("çiftir");
    }



    }



}
