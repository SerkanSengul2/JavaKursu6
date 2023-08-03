package _0_tekrarlar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class denemetekrar {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        HashSet<String> ulkeler = new HashSet<>();
        HashSet<String> degisen = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("1.ülke adlarını giriniz= ");
            String ulkeu= oku.nextLine();
            ulkeler.add(ulkeu);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("2.ülke adlarını giriniz= ");
            String degisenu= oku.nextLine();
            degisen.add(degisenu);
        }

        ArrayList<String> ortak = commonValues(ulkeler, degisen);
        System.out.println("ortak = " + ortak);

    }

    public static ArrayList<String> commonValues(HashSet<String> ulkeler, HashSet<String> degisen) {
        ArrayList<String> ortak = new ArrayList<>();
        HashSet<String> toplanan = new HashSet<>();
        toplanan.addAll(ulkeler);
        toplanan.retainAll(degisen);

        ortak.addAll(toplanan);

        return ortak;
    }
}













