package _0_tekrarlar;

import java.util.Scanner;

public class odevjava_02 {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku = new Scanner(System.in);
        System.out.print("3 adet sayı giriniz= ");
        String cumle = oku.nextLine();
        int bosluk = cumle.indexOf(" ");
        int bosluk2 = cumle.lastIndexOf(" ");
        int s1 = Integer.parseInt(cumle.substring(0, bosluk));
        int s2 = Integer.parseInt(cumle.substring(bosluk + 1, bosluk2));
        int s3 = Integer.parseInt(cumle.substring(bosluk2+1));
        int toplam = s1 + s2 + s3;
        System.out.println("toplam = " + toplam);
        if (toplam % 2 == 1) {
            System.out.println("tektir");
        }
        if (toplam%2==0){
            System.out.println("çiftir");
        }


    }


}
