package Gun41._01_JavaLocalDateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter b = DateTimeFormatter.ofPattern("HH:mm:ss");


        Scanner oku = new Scanner(System.in);
        System.out.println("bu foramtta bir saat giriniz =" + ("15 28 36"));
        String okunansaat = oku.nextLine();
        LocalTime samet = LocalTime.parse(okunansaat, b);
        System.out.println("samet = " + samet);
        int u = 1;
        while (true) {

            System.out.print("\r" + samet.minusSeconds(u).format(b));
            Thread.sleep(1000);
            u++;
        }

    }
}

        //TODO: Şu anki saati
        // Okunan saati geriye doğru saniye saniye saydırınız.
        //19:35:56 formatındaki
        //minusecond - saniye demek













