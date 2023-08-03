package Gun04;

public class _03_Tipdonusturmeleri {
    public static void main(String[] args) {

        //1.küçük alanı > büyüğe atabiliyor(genişleme=widening)
        //byte->short->int->long->float->double
        //veri kaybı olmaz

        int sayi = 9;
        long toplam = 6700;
        double oran = 3.2;
        oran=sayi;//tam sayı,daha geniş ondalıklı hafızaya atılıyor
        //veri kaybı yok;
        System.out.println("oran = " + oran);

        toplam=sayi;//int,long'a atıldı
        System.out.println("toplam = " + toplam);

        oran=toplam;//long--double atandı
        System.out.println("oran = " + oran);



    }


}
