package Gun08;

public class _06_JavaAritmeticOperators {
    public static void main(String[] args) {
        int toplam = 5;
        int sayac = 0;
        int a = toplam + sayac++;//once : sayac=0 toplam=0 sonra toplam=5 sayac=0
        System.out.println("a = " + a);

        toplam = 0;
        toplam = 5 + sayac++;// once:sayac=0 toplam=0 sonra: toplam=5 sayac=1

        //özet ++lar sağda ise once yazar sonra attırır.
        //özet ++lar solda ise önce toplar sonra attırır.



    }


}
