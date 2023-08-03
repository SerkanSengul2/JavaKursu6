package OdevArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
//        getSum() isminde bir method oluşturun.
//        Parametresi ArrayList olmalı
//        Return tipi int olmalı.
//        ArrayList teki tüm sayıları birbiri ile toplayın.
//        return olarak toplam sonucu döndürün.
//         Örneğin;
//        Arraylist = 1,2,3,4,5
//        return 15 olmalı
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        int sayi = GetSum(liste);
        System.out.println("sayi = " + sayi);
    }

    public static int GetSum(ArrayList<Integer> liste) {
        int sayi = 0;
        for (int i = 0; i < liste.size(); i++) {
            sayi += liste.get(i);
        }
        return sayi;
    }

}






