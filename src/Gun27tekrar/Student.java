package Gun27tekrar;

import java.util.ArrayList;

public class Student {

    String name;
    int maxsaat;
    ArrayList<LessoN> dersleri = new ArrayList<>();

    public void DerSYazdir() {
        System.out.println("\nOgrencının tarnskripti");
        System.out.println("Ogrenının adı=" + this.name);
        System.out.println("Alınan dersler aşağıdadır");

        for (LessoN d : this.dersleri) {
            System.out.println(d.name +"-"+ d.saat);
        }

    }

    public static void Kurallar() {
        System.out.println("\n1.kural= Serkanın amk");
        System.out.println("2.kural= Orhanın amk");
    }

}
