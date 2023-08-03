package Mentoring;

import java.util.Scanner;

public class ornek01 {
    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz= ");
        int sayi = oku.nextInt();

        if (sayi % 4 == 2 && sayi > 0) {
            System.out.println("sayi = " + sayi);

        }



    }


}
