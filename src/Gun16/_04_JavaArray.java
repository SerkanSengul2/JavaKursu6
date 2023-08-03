package Gun16;

public class _04_JavaArray {
    public static void main(String[] args) {

        int[] dizi = new int[5];//0-1-2-3-4
        int[] dizi2 = {3, 66, 44, 55, 77};//5 elamanlı dizi,hem tanımlandı hem de değer atandı

        String[] cumleler = new String[5];//5 tane cumle/kelime saklayabilen bir String dizi değişkeni
        boolean[] dizi3 = new boolean[5];//5 tane (true/false) saklayabilen bir dizi değişkeni
        double[] oranlar = new double[5];//5 tane ondalık saklayabilen bir dizi değişkeni

        for (int i = 0; i <dizi.length ; i++) {
            System.out.println("dizi = " + dizi[i]);
        }

        for (int i = 0; i <dizi.length ; i++) {
            System.out.println("cumleler = " + cumleler[i]);

        }

        for (int i = 0; i <dizi.length ; i++) {
            System.out.println("dizi3 = " + dizi3[i]);
        }
        for (int i = 0; i <dizi.length ; i++) {
            System.out.println("oranlar = " + oranlar[i]);

        }
}
}
