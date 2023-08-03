package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetoda {
    public static void main(String[] args) {
        //ilkel tip
        int sayi = 5;
        SayiArtir(sayi);//sadece değer gelir
        System.out.println("sayi = " + sayi);
        sayi = SayiArtir2(sayi);
        System.out.println("sayi = " + sayi);

        //refans tiplerde nasıl oluyor

        int[] dizi = {1, 2, 3, 4};
        dizisifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi));//giden refansı ise 0000-degıl ise 1234

        //nesne tiplerde nasıl oluyor

        String kelime="ismet";
        kelimesifirla(kelime);
        System.out.println("kelime = " + kelime);

    }public static void kelimesifirla(String kelime){
        kelime="";
    }

    public static void dizisifirla(int[] dizi) {
        dizi[0] = 0;
        dizi[1] = 0;
        dizi[2] = 0;
        dizi[3] = 0;
    }

    public static void SayiArtir(int sayi) {//ilkel tiplerde sadece değer gelir
        sayi++;
    }

    public static int SayiArtir2(int sayi) {//
        sayi++;
        return sayi++;
    }


}