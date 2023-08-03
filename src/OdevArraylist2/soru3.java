package OdevArraylist2;

import Gun15._debugornek2_;

import java.util.*;

public class soru3 {
    public static void main(String[] args) {
//        commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//        return tipi arraylist olmalı.
//        **ÖRNEĞİN:**
//        İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//        İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//        Ortak değerleri ArrayListe ekleyiniz.
//        çıktı:  "Germany" , "Brazil" ,"USA"
//        ArrayListi yazdırınız
        HashSet<String> ulkeler = new HashSet<>();
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("1. ülkeleri giriniz= ");
            String ulke = oku.nextLine();
            ulkeler.add(ulke);
        }
        HashSet<String> degisenulkeler = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("2. ülkeleri giriniz= ");
            String degisen = oku.nextLine();
            degisenulkeler.add(degisen);
        }
        ArrayList<String> ortakule = commonValues(degisenulkeler, ulkeler);
        System.out.println("ortakule = " + ortakule);
    }

    public static ArrayList<String> commonValues(HashSet<String> degisenulkeler, HashSet<String> ulkeler) {
        ArrayList<String> ortakulke = new ArrayList<>();

        HashSet<String> ortakulke2 = new HashSet<>();
        ortakulke2.addAll(degisenulkeler);
        ortakulke2.addAll(ulkeler);



        ortakulke.addAll(ortakulke2);

        return ortakulke;
    }


}



