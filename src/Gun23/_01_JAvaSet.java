package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_JAvaSet {
    public static void main(String[] args) {
        int sayi = 5;
        int[] dizi = new int[6];
        ArrayList<Integer> liste = new ArrayList<>();

        //Java'cım şuana kadar verdiğin değişkenler için teşekkür ederim.
        //bir çok işimi gördü,bana öyle bir dizi tipi verki,içinde tekar eden değerler olmasın
        //her zaman sıralı olsun,bazen istersem eklediği sırada sıralı olsun
        //bazen de olabildiğince hızlı çalış sıra önemli değil.
        //Java mektubumuza cevap verdi;
        //Sevgili Serkan;sen hiç canını sıkma,bu iş için tasarlanmış SET'ler adını verdiğimiz.
        //özel diziler var.
        //HashSet->sen ekledikçe hızlı çalışmak için kendine göre bir sırada tutuyor.
        //LinkedHashSet->sen ekledikçe,eklenme sırasına göre tutuyor.
        //TreeSet->sen ekledikçe onları her zaman sıralı tutuyor.
        //Bunların ortak özelliği tekrar eden değer yok.Ve index yok

        HashSet<Integer>hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        hs1.add(5);//tekrar eklendi.acaba diziye kabul etti mi
        hs1.add(2);//tekrar eklendi.acaba diziye kabul etti mi
        System.out.println("hs1 = " + hs1);
        

    }

}
