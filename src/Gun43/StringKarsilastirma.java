package Gun43;

public class StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        if (cumle1==cumle2)
            System.out.println("cumle 1 ve cumle 2 eşit");
        else
            System.out.println("cumle 1 ve cumle 2 eşit değil");

        if (cumle1.equals(cumle2))
            System.out.println("cumle 1 ve cumle 2 eşit");
        else
            System.out.println("cumle 1 ve cumle 2 esıt degıl");

        //Refarans tiplerde ise durum
        //Scanner le ekrandan okudugunda asagıdakı gıbı oluyor
        String cumle3= new String("Bugün hava çok güzel");
        String cumle4= new String("Bugün hava çok güzel");
        if (cumle3==cumle4)//== refans tiplerde REFERANSLARI aynı mı
            System.out.println("cumle 3 ve cumle 4 eşit");

        else
            System.out.println("cumle 3 ve 4 eşit degıl");

        //degerleri aynı mı

        if (cumle3.equals(cumle4))// equals HERZAMAN DEĞERLİ karşılaştırır.
            System.out.println("cumle 3 ve 4 eşit");
        else
            System.out.println("cumle 3 ve 4 esıt degıl mı ");

        //OZET: Nesne(String) ve referans(dizi,ArrayList,Nesneler)tiplere herzaman
        //EQUALS kullanıılır
        //İlker tiplerde (Sayısal,boolean) tiplerde "==" kullanılır.

    }
}
