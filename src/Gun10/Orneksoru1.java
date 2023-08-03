package Gun10;

import java.util.Scanner;

public class Orneksoru1 {
    public static void main(String[] args) {

//kullanıcan 2 kez gircegi şifre aynı olup olmadıgını aynı veya degıl cevaplayınız


        Scanner oku = new Scanner(System.in);
        System.out.print("şifre 1=");//merhaba 78.adada olsun
        String s1 = oku.nextLine();
        System.out.print("şifre 2= ");//merhaba bu hafızada 88adada olsun
        String s2 = oku.nextLine();
        if (s1.equals(s2) == true) {//Stringlerde hafızadaki yerlerni kontrol eder.
            System.out.println("tamam");
        }

        if (s1.equals(s2) == false) {
        }
//olması gereken String ifadelrde bu iş yapılmış olan
        //içerik karşılaşrıcı equals kullanılmadılır.

//String eşitlemlerde == kullanma equals kulnan.


    }
}
