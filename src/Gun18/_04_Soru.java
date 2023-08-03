package Gun18;

import java.util.Random;

public class _04_Soru {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz
        int teksayimik=0;

        int[][] tablo = new int[2][3];

        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                tablo[satir][sutun] = (int) (Math.random() * 100);
                System.out.println();

                if (tablo[satir][sutun]%2==1)
                    teksayimik++;
            }
        }
             System.out.println("teksayimik = " + teksayimik);

    }
}



