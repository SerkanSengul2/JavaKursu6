package _0_tekrarlar;

import java.util.Scanner;

public class Javasamet01 {
    public static void main(String[] args) {
        //serkan_sengul@apple.com
        //Serkan
        //Sengul
        //Apple

        Scanner oku=new Scanner(System.in);
        System.out.print("mail adresinizi yazınız= ");
        String mail=oku.nextLine();
        int cizgi=mail.indexOf("_");
        int et=mail.indexOf("@");
        int nokta=mail.indexOf(".");
        char ad=mail.toUpperCase().charAt(0);
        String ad2=mail.substring(1,cizgi);
        char soyad=mail.toUpperCase().charAt(cizgi+1);
        String soyad2=mail.substring(cizgi+2,et);
        char dom=mail.toUpperCase().charAt(et+1);
        String dom2=mail.substring(et+2,nokta);
        System.out.println(ad+ad2);
        System.out.println(soyad+soyad2);
        System.out.println(dom+dom2);













    }




}
