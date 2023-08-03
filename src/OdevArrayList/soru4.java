package OdevArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
//        getLength() isminde bir method oluşturun.
//        Parametre olarak String ArrayList
//        Return tipi Integer ArrayList
//        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//                Tüm elementlerin uzunluğunu döndürün
//                Örneğin;
//        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//        Tüm Stringlerin uzunluklarını yazdırın;
//        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
        Scanner okuint = new Scanner(System.in);
        ArrayList<String> liste = new ArrayList<>();
        String cevap;
        do {
            System.out.print("bir sehir giriniz= ");
            String oku = okuint.next();
            liste.add(oku);
            System.out.println("devam etmek istiyor musunuz?(E/H) ");
            cevap = okuint.next();
        } while (cevap.equalsIgnoreCase("E"));

        ArrayList<Integer> uzunluk = Getlenght(liste);
        System.out.println("uzunluk = " + uzunluk);
    }

    public static ArrayList<Integer> Getlenght(ArrayList<String> liste) {
        ArrayList<Integer> uzunluk = new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            uzunluk.add(liste.get(i).length());

        }
        return uzunluk;
    }
}



















