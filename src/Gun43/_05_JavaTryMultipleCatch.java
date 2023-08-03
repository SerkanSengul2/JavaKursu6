package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05_JavaTryMultipleCatch {
    public static void main(String[] args) {

        try {//hata bölgesine şerit çekildi
            Scanner oku = new Scanner(System.in);

            System.out.print("Sayi1= ");
            int sayi1 = oku.nextInt();


            System.out.print("Sayi2= ");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

//            String kelime="";
//            kelime.charAt(3); genel hataya düşmesi için yapıldı

        } catch (ArithmeticException hata)//hata olursa yakala ve asagıdakı bolumu calıstır.
        {//hata mesajlarını hata isimli Exception cinsinden değişkene attım

            System.out.println("Sıfıra bölme hatası oluştu");
        } catch (InputMismatchException ex) {
            System.out.println("lütfen sayı giriniz");
        } catch (Exception ex) {
            System.out.println("bekleyenmeyen hata oluştu");
        }
    }
}