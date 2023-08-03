package Gun25._04soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Otogaleri {
    public static void main(String[] args) {
        Scanner okuInt = new Scanner(System.in);
        Scanner okuln = new Scanner(System.in);
        ArrayList<araba> galeri = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            araba a = new araba();

            System.out.print("Araba no= ");
            a.arabano = okuInt.nextInt();
            System.out.print("Araba markası= ");
            a.marka = okuln.nextLine();
            System.out.print("araba üretim yılı");
            a.uretimyili = okuInt.nextInt();

            galeri.add(a);

        }
        arabalariyazdir(galeri);
        uretimortalamasiyazdir(galeri);
    }

    public static void arabalariyazdir(ArrayList<araba> galeri) {
        for (araba a : galeri)
            System.out.println(a.arabano + " " + a.marka + " " + a.uretimyili);
    }

    public static void uretimortalamasiyazdir(ArrayList<araba> galeri) {
        int toplamyil = 0;
        for (araba a : galeri)
            toplamyil = toplamyil + a.uretimyili;

        int ort = toplamyil / galeri.size();
        System.out.println("ort= " + ort);
    }
}
