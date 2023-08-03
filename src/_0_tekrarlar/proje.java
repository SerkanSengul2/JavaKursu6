package _0_tekrarlar;

import java.util.Scanner;

public class proje {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        boolean Secim = false;
        String Kahvesecim;
        String[] KahveSecenkleri = {"Türk kahvesi", "Filtre kahve", "Espresso"};

        do {


            System.out.println("Hangi kahveyi istersiniz? ");
            for (int i = 0; i < KahveSecenkleri.length; i++) {
                System.out.println((i + 1) + ". " + KahveSecenkleri[i]);
            }
            System.out.print("Kahvenizi Seçin= ");
            Kahvesecim = oku.nextLine();

            for (int i = 0; i < KahveSecenkleri.length; i++) {
                if (Kahvesecim.equalsIgnoreCase(KahveSecenkleri[i])) {
                    System.out.println("Seçiminiz= " + KahveSecenkleri[i] + " şu anda hazırlanıyor");
                    Secim = true;

                }
            }
            if (!Secim)
                System.out.println("hatalı tuşlama yaptınız");
        } while (!Secim);

        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayın");

        String sutSecim = oku.nextLine();
        if (sutSecim.equalsIgnoreCase("evet"))
            System.out.println("Süt ekleniyor...");

        else if (sutSecim.equalsIgnoreCase("hayır"))
            System.out.println("Süt eklenmiyor");

        System.out.println("Şeker ister misiniz? (Evet veya Hayır olarak cevaplayın");
        String sekerSecim = oku.nextLine();
        if (sekerSecim.equalsIgnoreCase("Evet")) {
            System.out.println("Kaç şeker olsun?");
            int kacSeker = okuInt.nextInt();
            System.out.println(kacSeker + " " + "şeker ekleniyor");
        } else if (sekerSecim.equalsIgnoreCase("Hayır"))
            System.out.println("Şeker eklenmiyor");

        String[] kahveBoyut = {"Büyük boy", "Orta boy", "Küçük boy"};
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.");
        String boyut = oku.next();

        for (int i = 0; i < kahveBoyut.length; i++) {
            if (boyut.equalsIgnoreCase(kahveBoyut[i]))
                System.out.println("kahveniz, " + kahveBoyut[i] + " ,hazırlanıyor");
        }
        System.out.println(Kahvesecim + " " + boyut + " hazırdır.Afiyet olsun!!!");
    }


}


