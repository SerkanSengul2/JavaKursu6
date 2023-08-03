package GenelTekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Konu {
    public static void main(String[] args) {
//        ismi getCount() olan bir method oluşturun.
//        Parametre olarak bir String ArayList  ve  bir tane String
//        Return tipi int olmalı.
//        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//        Örneğin;
//        ArrayList = Orange , Kiwi , Peach , Banana , Orange
//        String Orange:
//        Count = 2 olmalı. (Orange 2 kez yazılmış)
        ArrayList<String> liste = new ArrayList<>();
        Scanner oku = new Scanner(System.in);
        String cevap;

        do {
            System.out.print("meyve giriniz=");
            String soru = oku.next();
            System.out.print("devam etmek istiyor musunuz?(E/H)");
            liste.add(soru);
            cevap = oku.next();
        } while (cevap.equalsIgnoreCase("E"));
        System.out.print("hedef meyveyi giriniz=");
        String hedef = oku.next();
        int sayac = getcount(liste, hedef);
        System.out.println("sayac = " + sayac);



    }

    public static int getcount(ArrayList<String> liste, String hedef) {
        int sayac = 0;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).equalsIgnoreCase(hedef)) {
                sayac++;
            }

        }
        return sayac;
    }
}




