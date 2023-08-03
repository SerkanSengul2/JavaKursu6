package Gun21tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner okustr = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);
        double toplam = 0;
        String cevap;
        ArrayList<Integer> notlar = new ArrayList<>();
        do {
            System.out.print("bir not giriniz=");
            int not = okustr.nextInt();
            toplam += not;
            notlar.add(not);
            System.out.print("Devam etmek istiyor musunuz= (E/H)");
            cevap = okuint.next();
        } while (cevap.equalsIgnoreCase("E"));

        double ortalama = toplam/ notlar.size();
        int geceler=0;
        for (int i = 0; i < notlar.size() ; i++) {
           if (notlar.get(i)>ortalama)
               geceler++;
        }
        System.out.println("geceler = " + geceler);
    }
    


}


