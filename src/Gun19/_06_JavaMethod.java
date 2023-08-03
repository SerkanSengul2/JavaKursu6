package Gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {

//bir sayının tek mi çift mi olduğunu yazdırınız.

        int sayi = 55;
        if (sayi % 2 == 0)
            System.out.println("çift");
        else
            System.out.println("tek");
        /************************************/

        TekMiCiftMiYaz(55);
        TekMiCiftMiYaz(60);

    /*****************************************/
        okuTekMiCiftMiYaz();

    }

    public static void TekMiCiftMiYaz(int sayi) {

        if (sayi % 2 == 0) {
            System.out.println("m.çift");
        } else
            System.out.println("m.tek");
    }
    public static void okuTekMiCiftMiYaz()
    {
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi= oku.nextInt();
        TekMiCiftMiYaz(55);

    }


}
