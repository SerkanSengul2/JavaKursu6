package _0_tekrarlar;

import java.util.Scanner;

public class odevjava_01 {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67   gibi

        Scanner oku = new Scanner(System.in);
        System.out.print("şifre giriniz= ");
        String sifre = oku.nextLine();
        int bosluk = sifre.indexOf(" ");
        int s1=Integer.parseInt(sifre.substring(0,bosluk));
        int s2=Integer.parseInt(sifre.substring(bosluk+1));
        if (s1==s2){
            System.out.println("doğru");
        }
        else
            System.out.println("hatalı");


    }


}
