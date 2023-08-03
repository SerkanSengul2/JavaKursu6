package OdevArraylist2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
//        totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//        _**Örnek:**_
//                hashset ; 4,2,3,1,7
//        cevap: 5
        Scanner oku = new Scanner(System.in);
        HashSet<Integer> eleman = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("bir sayı giriniz= ");
            eleman.add(oku.nextInt());
        }
        System.out.println("eleman = " + eleman);

        int totalCount=totalCount(eleman);
        System.out.println("totalCount = " + totalCount);
    }

    public static int totalCount(HashSet<Integer> eleman) {


        return eleman.size();
    }
}


