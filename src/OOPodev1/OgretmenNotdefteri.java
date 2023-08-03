package OOPodev1;

import Gun25._03_Ornek.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class OgretmenNotdefteri {
    public static void main(String[] args) {
        Scanner okuint = new Scanner(System.in);
        Scanner okustr = new Scanner(System.in);

        ArrayList<OGR> ogrenciler = new ArrayList<>();


        for (int i = 0; i < 3; i++) {

            OGR ogrenci = new OGR();

            System.out.print("ogrencı adi= ");
            ogrenci.adi = okustr.nextLine();
            System.out.print("Ogrenci okul numarası= ");
            ogrenci.okulno = okuint.nextInt();
            System.out.print("ogrenci notu= ");
            ogrenci.notu = okuint.nextInt();

            ogrenciler.add(ogrenci);
        }
        ogrenciortalamasi(ogrenciler);
        ogrencileriyaz(ogrenciler);
    }

    public static void ogrencileriyaz(ArrayList<OGR> ogrenciler) {

        for (OGR liste : ogrenciler)
            System.out.println("ogrencı adı= " + liste.adi + " " + "ogrecının okul numarası= " + liste.okulno + " " + "Ögrencinin notu= " + liste.notu);
    }

    public static void ogrenciortalamasi(ArrayList<OGR> ogrenciler) {
        int ortalamanot = 0;
        for (OGR liste : ogrenciler)
            ortalamanot += liste.notu;

        int ort = ortalamanot / ogrenciler.size();
        System.out.println("ort = " + ort);

    }


}

