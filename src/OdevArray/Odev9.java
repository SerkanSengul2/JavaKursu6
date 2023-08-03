package OdevArray;

public class Odev9 {
    public static void main(String[] args) {
//        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dizi = new int[]{15, 25, 22, 18, 30};

        int enbuyuksayi = dizi[0];
        int enbuyuksayi2 = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enbuyuksayi) {
                enbuyuksayi2 = enbuyuksayi;
                enbuyuksayi = dizi[i];
            } else if (dizi[i]>enbuyuksayi2)
                enbuyuksayi2=dizi[i];


        }
        System.out.println("2.en büyüksayı = " + enbuyuksayi2);
    }


}
