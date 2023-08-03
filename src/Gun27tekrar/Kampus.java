package Gun27tekrar;

import Gun27.ornek3.Lesson;

public class Kampus {
    public static void main(String[] args) {

        Student ogr1 = new Student();
        ogr1.Kurallar();

        LessoN ders1 = new LessoN();
        LessoN ders2 = new LessoN();
        LessoN ders3 = new LessoN();

        ders1.name = "Kimya";
        ders1.saat = 8;
        ders2.name = "Matematik";
        ders2.saat = 10;
        ders3.name = "Fizik";
        ders3.saat = 6;

        ogr1.name = "Serkan";
        ogr1.maxsaat = 20;

        ogr1.dersleri.add(ders1);
        ogr1.dersleri.add(ders2);
        ogr1.dersleri.add(ders3);
        ogr1.DerSYazdir();


    }
}
