package Gun16;

public class _01_JavaDiziNedir_Array {
    public static void main(String[] args) {

        //bana bir tanımlada birden fazla deger tutabilen bir değişkene ihtiyacım var
        //çözüm:
        int[]notlar=new int[50];//50 tane int saklayabilen notlar isimli değişken.
        notlar[0]=75;
        notlar[1]=88;
        notlar[49]=95;//lenght gibi 0-49=50 gibi

        System.out.println("notlar[0] = " + notlar[0]);
        System.out.println("notlar.length = " + notlar.length);
        //50 yani toplam eleman sayısını verir.



    }


}
