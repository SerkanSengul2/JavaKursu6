package Gun13;

import java.util.Scanner;

public class _08_WhileLoop {
    public static void main(String[] args) {

        //kullanıcının girecegı 20 sayıdan tek olanlarının toplamanı bulunuz

        Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;

        while (sayac <=20) {
            System.out.print("sayı giriniz= ");
            int sayi = oku.nextInt();
            if (sayi % 2 == 1)
                toplam = sayi + toplam;
            sayac++;
            }
            System.out.println("toplam = " + toplam);




    }
}
