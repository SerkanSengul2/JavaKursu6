package Gun27.ornek3;

import Gun26.ornek.soru.Ogrenci;

import java.util.ArrayList;

public class Student {
    String name;
    int maxsaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersYazdir() {

        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın," + this.name);
        System.out.println("Aldığınız dersler aşağıdadır.");

        for (Lesson d : this.dersleri)
            System.out.println(d.name+"-"+ d.saat);

    }

    public static void universitekurallari() {
        System.out.println("Kural 2= çaysız gelme");
        System.out.println("Kural 1= sürekli tekrar");
    }

}


