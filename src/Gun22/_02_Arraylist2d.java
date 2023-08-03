package Gun22;

import java.util.ArrayList;

public class _02_Arraylist2d {
    public static void main(String[] args) {
        int sayi = 5; // tek bir rakam saklayabilen bir değişken
        int[] dizi = new int[20]; // 20 adet sayı saklayabilen bir değişken,
        // uzunluk sabit, her bir hücresinde bir sayı var

        int[][] tablo = new int[20][10]; // 20 satır 10 sutunu var, 200 sayı saklar
        // uzunluk sabit, her bir hücrede bir dizi var
        // her bir satırda 10 sayı olan bir dizi var

        ArrayList<Integer> liste = new ArrayList<>();// her bir satır(hücresi)
        // Integer bir sayı saklayabilecek, atıldıkça
        // Integer ın listi, uzunluk değişken

        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(50);
        fizNotlari.add(60);

        kimNotlari.add(50);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //Arraylistlerin arraylisti

        ArrayList<ArrayList<Integer>> tumNotlar = new ArrayList<>();
        tumNotlar.add(matNotlari);
        tumNotlar.add(fizNotlari);
        tumNotlar.add(kimNotlari);

        tumNotlar.get(0);//matnotlarınız
        tumNotlar.get(0).get(0);//ilk mat notu

        System.out.println("tumNotlar.get(0) = " + tumNotlar.get(0));//matnotları
        System.out.println("tumNotlar.get(1) = " + tumNotlar.get(1));//fiznotları
        System.out.println("tumNotlar.get(2) = " + tumNotlar.get(2));//kimnotları

        //ilk mat notu
        System.out.println("tumNotlar.get(0).get(0) = " + tumNotlar.get(0).get(0));
        /*********************** satır yazdırma *****/
        for (int i = 0; i < tumNotlar.size(); i++) {
            System.out.println("tumNotlar = " + tumNotlar.get(i));

        }
        /******** satır ve sütün yazdırma ***/
        for (int i = 0; i < tumNotlar.size(); i++) {
            for (int j = 0; j < tumNotlar.get(i).size(); j++) {
                System.out.println("tek tek notlar= " + tumNotlar.get(i).get(j));
            }

        }


    }


}
