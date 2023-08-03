package ODEVjava01;

import java.util.Scanner;

public class odev02 {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku = new Scanner(System.in);
        System.out.print("3 adet tam sayı giriniz= ");
        String sayi = oku.nextLine();
        int bosluk = sayi.indexOf(" ");
        int bosluk2 = sayi.lastIndexOf(" ");
        int s1 = Integer.parseInt(sayi.substring(0, bosluk));
        int s2 = Integer.parseInt(sayi.substring(bosluk + 1, bosluk2));
        int s3 = Integer.parseInt(sayi.substring(bosluk2+1));
        int toplam = s1 + s2 + s3;
        System.out.println("toplam = " + toplam);
        if (toplam % 2 == 1) {
            System.out.println("tektir");
        } else
            System.out.println("çifttir");

    }


}
