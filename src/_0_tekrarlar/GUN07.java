package _0_tekrarlar;

import java.util.Scanner;

public class GUN07 {
    public static void main(String[] args) {
// Girilen bir ad soyadı örneğin "Kerem Dizdar" K.D  şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("adınız ve soyadınız= ");
        String adsoyad=oku.nextLine();
        char ilkharf=adsoyad.charAt(0);
        int bosluk=adsoyad.indexOf(" ");
        char sonharf=adsoyad.charAt(bosluk+1);
        System.out.println("1.ve son harfi= "+ ilkharf+"."+sonharf);



    }


}
