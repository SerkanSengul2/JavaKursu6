package OdevArray;

public class Odev3 {
    public static void main(String[] args) {
//        İnt Array oluştur ve elemanları   : 25,30,30,35,100
//        Array in elemanlarının toplamını yazdır.
//                Cevap 220 olmalı.


        int[] sayi = new int[]{25, 30, 30, 35, 100};
        int toplam=0;
        for (int i = 0; i < sayi.length ; i++) {
        toplam=toplam+sayi[i];
            
        }

        System.out.println("toplam = " + toplam);
    }


}
