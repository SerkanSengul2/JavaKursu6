package _0_tekrarlar;

public class fordeneme {
    public static void main(String[] args) {
        int[] dizi = {2, 1, 5, 3, 6};
        int i;


        int enbuyuk = dizi[0];
        int ikinci = dizi[0];
        for (i = 1; i < dizi.length; i++) {
            if (dizi[i] > enbuyuk) {
                ikinci = enbuyuk;
                enbuyuk = dizi[i];
            } else if (dizi[i] > ikinci) {
                ikinci = dizi[i];
            }
        }
        System.out.println("İkinci büyük sayı: " + ikinci);


    }
}