package Gun18tekrar;

public class soru1 {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz
        int teksayi = 0;


        int[][] tablo = new int[2][3];
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j] = (int) (Math.random() * 100);
                if (tablo[i][j]%2==1)
                    teksayi++;

            }

        }

        System.out.println("bulunan tek sayi = " + teksayi);
    }


}
