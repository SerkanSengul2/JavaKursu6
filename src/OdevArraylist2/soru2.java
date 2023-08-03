package OdevArraylist2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
//        changeSet() isminde bir method oluşturun.
//        Parametre olarak bir String HashSet   ve  iki String
//        return hashset olmalı
//        Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//        **ÖRNEK:**
//        hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//        String 1 = **banana**
//        String 2 = **peach**
//        **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
        HashSet<String> meyveler = new HashSet<>();
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("meyve giriniz=");
            String meyve = oku.nextLine();
           meyveler.add(meyve);
        }
        System.out.print("degişmesi istenen meyve=");
        String m1 = oku.nextLine();
        System.out.print("değisecek meyve=");
        String m2 = oku.nextLine();
        

        HashSet<String> degisen = ChangeSet(meyveler, m1, m2);
        System.out.println("degisen = " + degisen);
      
    }


    public static HashSet<String> ChangeSet(HashSet<String> meyveler, String m1, String m2) {
        if (meyveler.contains(m1)) {
            meyveler.remove(m1);
            meyveler.add(m2);

        }
        return meyveler;
    }

}


