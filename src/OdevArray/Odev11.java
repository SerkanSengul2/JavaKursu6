package OdevArray;

public class Odev11 {
    public static void main(String[] args) {
//        int Array oluşturun ve elemanları : 12,2,5,15,8
//        En büyük değeri yazdırınız


        int[] dizi = new int[]{12, 2, 5, 15, 8};
        int enbuyuk = dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if (enbuyuk < dizi[i]) {
                enbuyuk = dizi[i];
            }

        }
        System.out.println("enkucuk = " + enbuyuk);
    }
}







