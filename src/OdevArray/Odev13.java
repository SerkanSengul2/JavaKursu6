package OdevArray;

import java.util.Arrays;

public class Odev13 {
    public static void main(String[] args) {
//        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
//        $ işaretlerini kaldırın ve sayıları toplayın.
//        Sayıların toplamını yazdırın.
        int toplam = 0;
        String[] dizi = {"$12", "$23", "$10", "$2", "$5", "$2"};

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = dizi[i].replaceAll("\\$", "");
            toplam += Integer.parseInt(dizi[i]);

        }
        System.out.println(toplam);

    }


}









