package Gun11;

import java.util.Scanner;

public class Orneksoru05 {
    public static void main(String[] args) {

// Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //olduğunu Ternary operatör ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi = oku.nextInt();

        String sonuc = (sayi > 0) ? "pozitif" : (sayi < 0) ? "negatif" : "sıfır";
        System.out.println("sonuc = " + sonuc);

    }
    //soru işareti ve iki nokta birlikte bir operatördür.
    //her soru işaretinin iki noktası olmak zorundadır.

}
