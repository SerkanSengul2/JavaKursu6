package _0_tekrarlar;

import java.util.Scanner;

public class gun0702 {
    public static void main(String[] args) {


        //tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp
        //ayrı ayrı yazdırınız(sadece ad ve soyad)

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız ve soyadadınız= ");
        String adsoyad=oku.nextLine();
        int bosluk=adsoyad.indexOf(" ");
        String ad=adsoyad.substring(0,bosluk);
        String soyad=adsoyad.substring(bosluk+1);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);









    }




}
