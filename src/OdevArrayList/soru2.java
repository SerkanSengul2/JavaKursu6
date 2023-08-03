package OdevArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class soru2 {
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
        String hedef = "Orange";
        liste.add("Orange");
        liste.add("kiwi");
        liste.add("Peach");
        liste.add("Banana");
        liste.add("Orange");
        int sayac = getCount(liste, hedef);
        System.out.print("sayac = " + sayac);
    }

    public static int getCount(ArrayList<String> liste, String hedef) {
        int sayac = 0;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).equalsIgnoreCase(hedef)) {
                sayac++;
            }
        }
        return sayac;
    }
}

