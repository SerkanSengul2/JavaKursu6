package Gun23;

import java.util.HashSet;
import java.util.Scanner;

public class _05_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(5);
        hs2.add(3);
        hs2.add(22);
        hs2.add(38);
        hs2.add(4);

        System.out.println("hs2 = " + hs2);
        System.out.println("hs1 = " + hs1);


        //birleştirme
        HashSet<Integer> birlesikhali = new HashSet<>();
        birlesikhali.addAll(hs2);
        birlesikhali.addAll(hs1);
        System.out.println("birlesikhali = " + birlesikhali);
        //farkı
        HashSet<Integer> farki = new HashSet<>();
        farki.addAll(hs1);
        farki.removeAll(hs2);// hs1 den hs2 yi çıkar
        System.out.println("farki = " + farki);
        //kesişim/ortak elamanlar
        HashSet<Integer> ortakelemanlar = new HashSet<>();
        ortakelemanlar.addAll(hs1);
        ortakelemanlar.retainAll(hs2);
        System.out.println("ortakelemanlar = " + ortakelemanlar);



    }


}

