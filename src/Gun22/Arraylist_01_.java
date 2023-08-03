package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arraylist_01_ {
    public static void main(String[] args) {
        //Array -> Array metodları,sort
        //Arraylist->Collection metodları
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);
        //sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);
        //tersine çevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);
        //bütün elemanları tek bir değer verme
        Collections.fill(sayilar, 0);
        System.out.println("sayilar = " + sayilar);
        //replace
        Collections.replaceAll(sayilar, 0, 5);
        System.out.println("sayilar = " + sayilar);

        //tanılarken değer atama
        int[] dizi = {2, 3, 45, 56};
        ArrayList<Integer> Liste = new ArrayList<>(Arrays.asList(3, 4, 56, 78, 89));
        ArrayList<String> StrList = new ArrayList<>(Arrays.asList("ahmet", "ayşe", "kaya"));
        System.out.println("Liste = " + Liste);
        System.out.println("StrList = " + StrList);
        System.out.println("sayilar = " + sayilar);

        //addALL= bir veya fazla değerleri liste ekler
        Collections.addAll(sayilar,56,77,88,99,77);
        System.out.println("sayilar = " + sayilar);
        
        //bir diziyi nasıl arrayliste atarım.
        Integer[]dizi2={2,3,45,56};
        ArrayList<Integer>liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);
    }
}
