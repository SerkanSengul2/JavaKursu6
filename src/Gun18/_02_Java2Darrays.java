package Gun18;

public class _02_Java2Darrays {
    public static void main(String[] args) {
        //önce satır okunur sonra sütün

        int[] dizi = new int[10];//10 tane deger bos halde,default 0
        int[] dizi2 = {2, 3, 4, 5, 6, 7, 8, 2, 4, 5};//10 tane hem tanımlandı hem değer atandı

        int[][] tablo = new int[2][3];//2 satır,3 sütun,default 0 değerine sahip

        int[][] tablo2 = {{2, 3, 44}, {45, 66, 5}};


        for (int satir = 0; satir < 2; satir++) {
            System.out.println("tablo2 = " + tablo2[satir][0]);//her bir satırın 0. elemanı
            System.out.println("tablo2 = " + tablo2[satir][1]);//her bir satırın 1. elemanı
            System.out.println("tablo2 = " + tablo2[satir][2]);//her bir satırın 2. elemanı
        }


        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.println("tablo2 = " + tablo2[satir][sutun] + " ");
            }
        }
        System.out.println();


    }
}





