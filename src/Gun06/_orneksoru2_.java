package Gun06;

import java.util.Scanner;

public class _orneksoru2_ {
    public static void main(String[] args) {
        
    //girilen bir ad soyadı "serkan şengül" S.Ş. şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("adınız ve soyadınız=");
        String adsoyad= oku.nextLine();
        char ilkharf=adsoyad.charAt(0);
        int bosluk=adsoyad.indexOf(" ");
        char soyad=adsoyad.charAt(bosluk+1);
        System.out.println(ilkharf+"."+soyad);


   



    }






}
