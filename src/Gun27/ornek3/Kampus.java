package Gun27.ornek3;

public class Kampus {
    public static void main(String[] args) {

        Student.universitekurallari();
        Lesson ders1 = new Lesson();
        Lesson ders2 = new Lesson();
        Lesson ders3 = new Lesson();

        ders1.name = "Algoritma";
        ders1.saat = 6;
        ders2.name = "java";
        ders2.saat = 6;
        ders3.name = "Test Tool";
        ders3.saat = 8;

        Student ogr1 = new Student();
        ogr1.name = "Serkan";
        ogr1.maxsaat = 20;

        ogr1.dersleri.add(ders1);
        ogr1.dersleri.add(ders2);
        ogr1.dersleri.add(ders3);

        ogr1.dersYazdir();

    }

}


