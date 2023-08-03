package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class orneksoru1 {
    public static void main(String[] args) {

        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(50);
        fizNotlari.add(60);

        kimNotlari.add(50);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        ArrayList<ArrayList<Integer>> tumNotlar = new ArrayList<>();
        tumNotlar.add(matNotlari);
        tumNotlar.add(fizNotlari);
        tumNotlar.add(kimNotlari);
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 50 70 80
        // Fizik : 30 40
        // Kimya : 60 70 80 90
        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");
        for (int i = 0; i < tumNotlar.size(); i++) {

            System.out.print(dersler.get(i) + ": ");

            for (int j = 0; j < tumNotlar.get(i).size(); j++) {
                System.out.print(tumNotlar.get(i).get(j) + "\t");
            }
            System.out.println();
        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("ders No((0-Mat, 1-Fiz, 2-Kim)=");
        int dersNo= oku.nextInt();

        dersNotlariniYazdir(dersNo,tumNotlar);

    }
public static void dersNotlariniYazdir(int dersNO, ArrayList<ArrayList<Integer>> tumNotlar){
    for (int i = 0; i <tumNotlar.get(dersNO).size() ; i++) {

        System.out.print(tumNotlar.get(dersNO).get(i)+"\t");
    }
}
}

// TODO
// Soru 3 :
// Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.