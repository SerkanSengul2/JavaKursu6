package GUN09;

import java.util.Scanner;

public class orneksoru5 {
    public static void main(String[] args) {

        //girilen bir öğrencinin notuna göre 50den büyük-eşit
        //ise geçtiniz,kücük ise kaldınız yazdırınız


        Scanner oku = new Scanner(System.in);
        System.out.print("not giriniz =");
        int not = oku.nextInt();
        if (not >= 50) {
            System.out.println("geçtiniz");
        }
        if (not < 50) {
            System.out.println("kaldınız");
        }


    }


}
