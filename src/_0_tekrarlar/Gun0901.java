package _0_tekrarlar;

import java.util.Scanner;

public class Gun0901 {
    public static void main(String[] args) {
        //girilen bir sayının tek sayı olup olmadıgını yazdırınız?


        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi= oku.nextInt();
        if (sayi%2==1){
            System.out.println("tektir");
        }
    else
            System.out.println("değildir");



    }



}
