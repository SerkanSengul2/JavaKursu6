package ODEVjava01;

import java.util.Scanner;

public class odev05 {
    public static void main(String[] args) {

//        Write a program that will print out the longest word. Note: Assume the length of the two given Strings will be different
//        Write a program that will print out first and last letters together.
//
//        Input: adobe
//        Input: adobe
//        Output: ae

        Scanner oku = new Scanner(System.in);
        System.out.print("kelime girin= ");
        String cumle = oku.nextLine();
        System.out.print("kelime girin= ");
        String cumle2 = oku.nextLine();
        if (cumle.length() > cumle2.length()) {
            char harf = cumle.charAt(0);
            char harf2 = cumle.charAt(cumle.length() - 1);
            System.out.println(cumle);
            System.out.println(" " + harf + harf2);


        } else {


            char harf = cumle2.charAt(0);
            char harf2 = cumle2.charAt(cumle2.length() - 1);
            System.out.println(cumle2);


            System.out.println(" " + harf + harf2);
        }


    }
}
