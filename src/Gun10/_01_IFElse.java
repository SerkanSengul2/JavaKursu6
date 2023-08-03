package Gun10;

import java.util.Scanner;

public class _01_IFElse {
    public static void main(String[] args) {

        //girilen bir öğrenci notuna göre 50den büyük eşit ise geçtiniz
        //küçük ise kaldınız

        Scanner oku = new Scanner(System.in);
        System.out.print("notu giriniz= ");
        int ogrnot = oku.nextInt();
        if (ogrnot >= 50) {
            System.out.println("geçtiniz");
        } else
            System.out.println("kaldınız");


    }


}
