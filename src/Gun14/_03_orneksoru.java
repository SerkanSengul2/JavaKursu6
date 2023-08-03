package Gun14;

import java.util.Scanner;

public class _03_orneksoru {
    public static void main(String[] args) {

        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku = new Scanner(System.in);
        String x;

        do {
            System.out.print("değer girin= ");
            x = oku.next();

            if (!x.equalsIgnoreCase("x"))

                System.out.println("program çalışıyor");


        } while (!x.equalsIgnoreCase("x"));

        System.out.println("program bitti");


    }


}
