package Gun11;

import java.awt.*;
import java.util.Scanner;

public class orneksoru02 {
    public static void main(String[] args) {

//otopark ücretleri;
//3 saate 10 tl 5 saate kadar 15tl 5den buyukse 20 tl
//kullanıcadn kac saat kaldıgını ucretını yazdırınız

        //eğer 3 ve 3 den kucukse 10 tl
        //eger 5den kucukse 150tl
        //eger 5den buyukse 20tl

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int saat = oku.nextInt();
        if (saat <= 3) {
            System.out.println("10 tl");
        }
        if (saat <= 5) {

        } else
            System.out.println("20 tl");
    }


}
