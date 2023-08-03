package OdevArraylist2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
//        removing() isminde bir method oluşturun.
//        Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//                Eğer Stringler LinkedHashset 'in içinde varsa, sil.
//        Return tipi linkedhashset
//               Örneğin,
//        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//        String 1= Germany
//        String 2 = USA
//                **Germany ve USA 'i sil.**
//        Set'i döndür.
        Scanner oku = new Scanner(System.in);
        LinkedHashSet<String> ulkeler = new LinkedHashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("ulke adı giriniz= ");
            String ulke = oku.nextLine();
            ulkeler.add(ulke);
        }
        System.out.print("silencek  ulke= ");
        String u1 = oku.nextLine();
        System.out.print("silenecek ulke= ");
        String u2 = oku.nextLine();

       LinkedHashSet<String>silinenulke=removing(ulkeler,u1,u2);
        System.out.println("silinenulke = " + silinenulke);



    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> ulkeler, String u1, String u2) {
        LinkedHashSet<String> ulkeler2 = new LinkedHashSet<>();
            ulkeler2.addAll(ulkeler);
            if (ulkeler2.contains(u1)){
                ulkeler2.contains(u2);
                ulkeler2.remove(u1);
                ulkeler2.remove(u2);

            }

           
              
            return ulkeler2;  }

}
