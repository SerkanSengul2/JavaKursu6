package Gun28.ornek02;

public class BlokClass {
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap();
        kitap1.name = "ahmet";
        kitap1.PublishYear = 1999;
        kitap1.author = "hasan";

        Kitap kitap2 = new Kitap("serkan", 2020, "hasan");

        Kitap kitap3 = new Kitap("kerem", 2022);

        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3);


    }
}

