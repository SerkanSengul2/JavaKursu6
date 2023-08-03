package Gun24JavaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CanliSozluk {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış
        Map<String, String> sozluk = new HashMap<>();
        Scanner oku = new Scanner(System.in);
        int secim;
        do {
            menuyugoster();
            secim = oku.nextInt();


            switch (secim) {
                case 1:
                    kelimekle(sozluk);
                    break;
                case 2:
                    kelimeduzelt(sozluk);
                    break;
                case 3:
                    kelimelistele(sozluk);
                    break;
                case 4:
                    kelimeara(sozluk);
                    break;
                case 5:
                    kelimesil(sozluk);
                    break;
                case 6:
                    System.out.println("iyi günler");
                    break;
                default:
                    System.out.println("hatalı işlem,bir daha giriniz");


            }


        } while (secim != 6);


    }

    public static void menuyugoster() {
        System.out.println("Canlı Sözlük");
        System.out.println("1- Ekleme");
        System.out.println("2- düzeltme");
        System.out.println("3- listeleme");
        System.out.println("4- arama");
        System.out.println("5- silme");
        System.out.println("6- çıkış");

    }

    //kelime varsa zaten bu kelime zaten ekle degıl ise kelime ekle
    public static void kelimekle(Map<String, String> sozluk) {
        Scanner oku = new Scanner(System.in);
        String kelime;

        do {

            System.out.print("kelime girin= ");
            kelime = oku.nextLine();
            if (sozluk.containsKey(kelime)) {
                System.out.println("bu kelime zaten ekli");
            } else {

                System.out.print("kelime anlamını girin=");
                String anlam = oku.nextLine();
                sozluk.put(kelime, anlam);
                System.out.println(kelime + " " + anlam + " eklendi ");
            }
        } while (!sozluk.containsKey(kelime));


    }


    public static void kelimeduzelt(Map<String, String> sozluk) {
        Scanner oku = new Scanner(System.in);
        String anlam;
        String kelime;
        do {
            System.out.print("kelime girin= ");
            kelime = oku.nextLine();

            if (sozluk.containsKey(kelime)) {
                System.out.print("Düzeltilecek anlam girin= ");
                anlam = oku.nextLine();
                sozluk.put(kelime, anlam);
                System.out.println(kelime + " anlamı " + anlam + " oldu");
            } else
                System.out.println("kelime bulunamadı");


        } while (!sozluk.containsKey(kelime));


    }

    public static void kelimelistele(Map<String, String> sozluk) {
        System.out.println("sozluk = " + sozluk);
    }

    public static void kelimeara(Map<String, String> sozluk) {
        Scanner oku = new Scanner(System.in);
        String kelime;

        do {
            System.out.print("Kelime giriniz= ");
            kelime = oku.nextLine();
            if (sozluk.containsKey(kelime)) {
                System.out.println("kelimenin anlamı = " + sozluk.get(kelime));
            } else
                System.out.println("bulunamadı");
        } while (!sozluk.containsKey(kelime));

    }

    public static void kelimesil(Map<String, String> sozluk) {
        Scanner oku = new Scanner(System.in);
        String kelime;
        do {
            System.out.print("Kelime giriniz= ");
            kelime = oku.nextLine();
            if (sozluk.containsKey(kelime)) {
                sozluk.remove(kelime);
                System.out.println("kelime silindi");
            } else
                System.out.println("kelime bulunamadı");
        } while (sozluk.containsKey(kelime));

    }
}



