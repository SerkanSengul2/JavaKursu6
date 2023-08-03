package Gun43;

import java.util.Scanner;

public class _04_RunTimeExpetion {
    public static void main(String[] args) {

        boolean DogruCalisti = true;
        do {


            try {//hata bölgesine şerit çekildi
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayi1= ");
                int sayi1 = oku.nextInt();


                System.out.print("Sayi2= ");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);
                DogruCalisti = true;
            } catch (Exception hata)//hata olursa yakala ve asagıdakı bolumu calıstır.
            {//hata mesajlarını hata isimli Exception cinsinden değişkene attım

                System.out.println("hata oluştu");
                System.out.println("hata= " + hata.getMessage());
                System.out.println("Lütfen 2. sayıyı 0 vermeyiniz");
                DogruCalisti = false;
            }

        } while (!DogruCalisti);
    }
}
