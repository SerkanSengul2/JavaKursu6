package Gun04;

public class _01_JavaString {
    public static void main(String[] args) {

        int sayac = 0;// sayı değerleri saklar
        String ad = "Serkan";// kelime ve kelimeler saklar

        System.out.println("sayac=" + sayac);//0 yazar
        System.out.println("ad=" + ad);//serkan yazar

        String soyad = "Şengül";
        System.out.println("soyad=" + soyad);

        String tamad = ad + soyad; //+ işareti sayılarda toplar.Kelimelerde yanyana birleştirir.
        System.out.println("tamad= "+tamad);


    }


}
