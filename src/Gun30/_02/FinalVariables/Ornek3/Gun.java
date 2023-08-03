package Gun30._02.FinalVariables.Ornek3;

import java.util.Scanner;

public class Gun {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Gun giriniz= ");
        int gun = oku.nextInt();
        System.out.print("Saat giriniz= ");
        int saat = oku.nextInt();
        System.out.print("Dakika giriniz= ");
        int dakika = oku.nextInt();

        System.out.println((gun * Sabitler.saat * Sabitler.dakika * Sabitler.saniye) +
                (saat * Sabitler.dakika * Sabitler.saniye)+(dakika*Sabitler.saniye));

    }
}
// Sabitler isimli bir Class da sabit bir şekilde
// bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
// bir dakikadaki saniye sayısını tanımlayınız.
// mainde kullanıcıdan gun, saat, dakika alarak toplam
// saniyeyi bulunuz.