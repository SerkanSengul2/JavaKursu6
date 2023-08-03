package _0_tekrarlar;

import java.util.Scanner;

public class gun0701 {
    public static void main(String[] args) {


        //girilen bir stringin sadece son harifini yazdırınız
        //son harf bulmak ıcın uzunluk-1(lenght-1)

        Scanner oku = new Scanner(System.in);
        System.out.print("cümle= ");
        String cumle=oku.nextLine();
        int uzunluk=cumle.length();
        char sonharf=cumle.charAt(uzunluk-1);
        System.out.println("sonharf = " + sonharf);
        

    }


}
