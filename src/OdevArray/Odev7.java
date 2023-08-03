package OdevArray;

public class Odev7 {
    public static void main(String[] args) {
//        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//        Array'in ortalamasını alınız.

        int[] dizi = new int[]{12, 14, 21, 23, 10, 4};
        int toplam=0;
        int ort=0;
        for (int i = 0; i <dizi.length ; i++) {
            toplam=toplam+dizi[i];
        }
            ort=toplam/dizi.length;
        System.out.println("ort = " + ort);
    }


}
