package OdevArray;

public class Odev10 {
    public static void main(String[] args) {
//        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//        En küçük (minimum) sayıyı yazdırınız.

        int[] dizi = new int[]{14, 19, 5, 21};
        int enkucuk = dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if (enkucuk >dizi[i] ) {
                enkucuk=dizi[i];
            }

        }
        System.out.println("enkucuk = " + enkucuk);
    }
}

