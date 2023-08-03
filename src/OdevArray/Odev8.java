package OdevArray;

public class Odev8 {
    public static void main(String[] args) {
//        Array oluşturun ve elemanları : 5,6,8,12,14,19
//        Eğer sayı çiftse topla, tekse çıkar.
//                **Örneğin:**
//        **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//        Toplamlarını yazdırın.

        int[] dizi = new int[]{5, 6, 8, 12, 14, 19};
        int toplam = 0;
        int cikarma = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                toplam = toplam + dizi[i];
            }
            if (dizi[i] % 2 == 1) {
                cikarma = cikarma + dizi[i];

            }
        }
        System.out.println("sonuc =" + (toplam - cikarma));


    }


}
