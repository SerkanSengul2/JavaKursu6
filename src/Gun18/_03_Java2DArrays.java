package Gun18;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {


        int[][] tablo =
                {{2, 3, 44},
                        {45, 66, 5}};

        System.out.println(Arrays.toString(tablo[0]));//0.satır tümü
        System.out.println(Arrays.toString(tablo[1]));//1.satır tümü
        System.out.println("tablo[0].length= " + tablo[0].length);//0.satırın uzunlugu
        System.out.println("tablo[1].length= " + tablo[1].length);//1.satırın uzunlugu

        System.out.println("tablo.length = " + tablo.length);//kaç satır var,satır uzunlugu


        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                System.out.print(tablo[satir][sutun] + " ");
            }
            System.out.println();
        }


    }


}
