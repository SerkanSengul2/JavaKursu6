package Gun12;

import java.awt.*;
import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {
// Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        Scanner okustr = new Scanner(System.in);
        System.out.print("1.sayi =");
        int sayi = oku.nextInt();
        System.out.print("2.sayi =");
        int sayi2 = oku.nextInt();
        System.out.println("toplama için  T");
        System.out.println("çıkartma için  Ç");
        System.out.println("çarpma için    P");
        System.out.println("bölme için     B");
        System.out.print("seçiminiz = ");
        String secim = okustr.next();
//ladder if

        if (secim.equalsIgnoreCase("T"))
            System.out.println(sayi + sayi2);
            else
                 if (secim.equalsIgnoreCase("Ç"))
            System.out.println(sayi - sayi2);
                else
                     if (secim.equalsIgnoreCase("P"))
            System.out.println(sayi * sayi2);
                else
                     if (secim.equalsIgnoreCase("B"))
            System.out.println(sayi);
                         else
                System.out.println("hatalı giriş= ");

    }


}
