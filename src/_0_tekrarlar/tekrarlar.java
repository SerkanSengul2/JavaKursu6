package _0_tekrarlar;

import java.util.Arrays;
import java.util.Scanner;

public class tekrarlar {
    public static void main(String[] args) {

        //2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        //daha sonra kullanıcadan bir sayı alınız.bu sayı tabloda
        //var ise yerinizi(satir,sütün).yazdırınız

        int[][] tablo = new int[2][3];
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j] = (int) (Math.random() * 10);


                Scanner oku = new Scanner(System.in);
                System.out.print("sayi giriniz=");
                int aranansayi = oku.nextInt();
                if (tablo[i][j] == aranansayi)
                    System.out.println("satir =" + i + "sutun =" + j);

            }

        }
    }

}




        


    










    


