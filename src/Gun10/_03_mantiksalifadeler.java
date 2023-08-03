package Gun10;

import java.util.Scanner;

public class _03_mantiksalifadeler {
    public static void main(String[] args) {

        //mantıksal ifadeler logic statement
        //&& ve işareti
        // || veya işareti

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi = oku.nextInt();

        if (sayi % 2 == 1 || sayi % 2 == -1) { //1 veya -1ken
            System.out.println("tek");
        } else
            System.out.println("çift");




    }


}
