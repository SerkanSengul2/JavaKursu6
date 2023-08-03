package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_ArrayList {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner okuint = new Scanner(System.in);
        Scanner okstr = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();
        double toplam = 0;
        String cevap = "";
        do {
            System.out.print("not giriniz= ");
            int not = okuint.nextInt();
            notlar.add(not);
            toplam += not;
            System.out.print("Devam etmek istyor musunuz=(E/H)");
            cevap = okstr.next();
        } while (cevap.equalsIgnoreCase("E"));

        double ortlama=toplam/notlar.size();
        int gecensayisi=0;
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>ortlama)
                gecensayisi++;

        }

        System.out.println("gecensayisi = " + gecensayisi);




    }
}