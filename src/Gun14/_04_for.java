package Gun14;

import javax.swing.*;

public class _04_for {
    public static void main(String[] args) {

        int sayac = 0;
        while (sayac <= 5) {
            System.out.println("sayac = " + sayac);
            sayac++;
        }

        System.out.println("sayac = " + sayac);
//dongunun bası bellı sonu bellı ve ne kadar artacagı bellı ise for döngüsü yapılır
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
            for (sayac=1; sayac<=5;sayac++);
            System.out.println("sayac = " + sayac);
        }
    }
//    Döngülerle ilgili sonuç özeti
//        1- Kaç kere döneceği belli ise : FOR düngüsü
//        2- Kaç kere döneceği belli değilse While veya doWhile
//           kontrol başta ise While,  sonda doWhile kullanacağız.


}
