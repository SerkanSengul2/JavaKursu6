package Gun31Enum._03;

import Gun31Enum._01_Konu.Enum.Aylar;

public class AylarMain {
    public static void main(String[] args) {
        AYLAR ay = AYLAR.AGUSTOS;
        ay.ayNO = 6;
        System.out.println("ay = " + ay);
        System.out.println("ay.ayNO = " + ay.ayNO);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);

        for (AYLAR a : AYLAR.values())
            System.out.println(a.ayNO + "- "+a.gunMiktar + "- "+a.ayAd);

    }
}
