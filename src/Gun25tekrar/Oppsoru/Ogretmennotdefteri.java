package Gun25tekrar.Oppsoru;

import OOPodev1.OGR;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogretmennotdefteri {
    public static void main(String[] args) {
        Scanner okustr = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);
        ArrayList<Ogrenci> defter = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci Ortak = new Ogrenci();

            System.out.print("ogrecinin adı= ");
            Ortak.adi = okustr.nextLine();
            System.out.print("ogrencinin okul numarası= ");
            Ortak.okulno = okuint.nextInt();
            System.out.print("ogrencinin notu= ");
            Ortak.notu = okuint.nextInt();
            defter.add(Ortak);

        }

        tumogrencileriyazdir(defter);
        notortalamasi(defter);

    }

    public static void tumogrencileriyazdir(ArrayList<Ogrenci> defter) {
        for (Ogrenci liste : defter)
            System.out.println("ogrecinin adı = " + liste.adi + " " + "Ogrencinin okul numarası= " + liste.okulno + " " + liste.notu + "Ogrencının notu=  ");


    }

    public static void notortalamasi(ArrayList<Ogrenci> defter) {
        int toplam = 0;
        for (Ogrenci a : defter)
            toplam += a.notu;
        int ortalama = toplam / defter.size();
        System.out.println("ortalama = " + ortalama);
    }


}
