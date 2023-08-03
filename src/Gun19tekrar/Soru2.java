package Gun19tekrar;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.

        int[] dizi = new int[20];
        yenidizi(dizi);


    }

    public static void yenidizi(int[] dizi) {

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);


            }

        System.out.println(Arrays.toString(dizi));
        }


    }








