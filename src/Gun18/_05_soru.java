package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_soru {
    public static void main(String[] args) {
        //2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        //daha sonra kullanıcadan bir sayı alınız.bu sayı tabloda
        //var ise yerinizi(satir,sütün).yazdırınız

        int[][] tablo = new int[2][3];
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                tablo[satir][sutun] = (int) (Math.random() * 10);


                Scanner oku = new Scanner(System.in);
                System.out.print("sayı giriniz=");
                int aranansayisayi = oku.nextInt();
                if (aranansayisayi == tablo[satir][sutun]) {
                    System.out.println("satir" + satir + ",sutun" + sutun);

                }

            }
        }

    }

}

