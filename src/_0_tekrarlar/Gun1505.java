package _0_tekrarlar;

import java.util.Scanner;

public class Gun1505 {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.


        Scanner oku = new Scanner(System.in);
        System.out.print("cumle yazınız=");
        String cumle = oku.nextLine();
        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == ' ')
                continue;
            System.out.println(cumle.charAt(i));

        }


    }}