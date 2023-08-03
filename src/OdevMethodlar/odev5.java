package OdevMethodlar;

import java.util.Arrays;

public class odev5 {
    public static void main(String[] args) {
        String[] dizi = {"ali", "veli", "deli" };
        String sira[] = sira(dizi);
        System.out.println(Arrays.toString(sira));

    }

    public static String[] sira(String[] dizi) {
        String[] sira = new String[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            sira[i] = dizi[dizi.length - 1 - i];

        }
        return sira;
    }
}
