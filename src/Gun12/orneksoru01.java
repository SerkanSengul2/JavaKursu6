package Gun12;

import java.awt.*;
import java.util.Scanner;

public class orneksoru01 {
    public static void main(String[] args) {

//girilen bir sayıya kadar random sayı üreterek tahmin etmeye calısınız
//kullanıcı bilirse tebrikler yazınız


        Scanner oku = new Scanner(System.in);
        System.out.print("Üretilecek sayı sınırı= ");
        int sinir = oku.nextInt();
        int tutulansayi = (int) (Math.random() * sinir);//6-> 0,1,2,3,4,5
        System.out.print("tahminiz= ");
        int tahmin = oku.nextInt();
        if (tutulansayi == tahmin) {
            System.out.println("tebrikler");
        } else
            System.out.println("bilemedin");
    }


}
