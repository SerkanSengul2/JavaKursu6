package Gun13;

import java.util.Scanner;

public class Orneksoru01 {
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

        switch (secim.toLowerCase()){
            case "t":System.out.println("toplam= "+(sayi+sayi2));break;
            case "ç":System.out.println("çıkartma =" + (sayi-sayi));break;
            case "p":System.out.println("çarma= "+(sayi*sayi2));break;
            case "b":System.out.println("bölme="+(sayi/sayi2));break;
            default:System.out.println("hatalı değer");







        }





    }



}
