package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_HasSet {
    public static void main(String[] args) {
        //SETS
        //HashSet:hızlı,kendine göre algoritmik sırada tutar.
        //LinkedHashSet:Eklenme sırasına göre sıralı tutuyor.
        //TreeSet:Nasıl eklersen ekle her zaman sıralı tutuyor.Keninden sort'lu


        //HashSet:hızlı,kendine göre algoritmik sırada tutar.
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

//LinkedHashSet:Eklenme sırasına göre sıralı tutuyor.
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        lhs1.add("bir");
        lhs1.add("iki");
        lhs1.add("üç");
        lhs1.add("dört");
        lhs1.add("beş");
        System.out.println("lhs1 = " + lhs1);
//TreeSet:Nasıl eklersen ekle her zaman sıralı tutuyor.Keninden sort'lu
        TreeSet<String> ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);
    }
}
