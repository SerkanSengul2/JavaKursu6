package OdevArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
//        İsmi changelnArraylist() olan bir method oluşturun.
//        Parametre olarak String ArrayList, String s1, String s2
//        Arraylist'te s1'i s2 olarak değiştirin
//        Return String arrayList
//                Örneğin;
//        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//        s1 = blue
//        s2 = yellow
//        Tüm blue 'ları yellow'a dönüştürün.
//        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
        Scanner okuint = new Scanner(System.in);
        ArrayList<String> liste = new ArrayList<>();
        String cevap;
        do {
            System.out.print("bir renk girin=");
            String oku = okuint.next();
            liste.add(oku);
            System.out.print("devam etmek istiyor musunuz?(E/H ");
            cevap = okuint.next();
        } while (cevap.equalsIgnoreCase("E"));
        System.out.print("degistırılecek rengı giriniz= ");
        String s1 = okuint.next();
        System.out.print("hangı renk olsun = ");
        String s2 = okuint.next();

        ArrayList<String> liste2 = changeln(s1, s2, liste);//MAİNDEN GÖNDERİLECEK

        System.out.println("liste2 = " + liste2);
    }


    public static ArrayList<String> changeln(String s1, String s2, ArrayList<String> liste) {//KARŞILAMA AŞAMASI
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).equalsIgnoreCase(s1))
                liste.set(i, s2);
        }
        return liste;
    }


}
//1.aşama mainde değişkenler yarat,bunları metot'a gönder


//2.aşama sonraki aşamada retrun ile yukarı çıkarmaya çalış.
