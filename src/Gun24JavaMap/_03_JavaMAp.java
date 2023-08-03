package Gun24JavaMap;

import java.util.*;

public class _03_JavaMAp {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();//map lerde hasHMap
        hm.put(9, "tilki");
        hm.put(2, "kedi");
        hm.put(30, "köpek");
        hm.put(11, "kuş");
        hm.put(4, "kurt");
        System.out.println("hm = " + hm);

        Map<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(9, "tilki");
        lhm.put(2, "kedi");
        lhm.put(30, "köpek");
        lhm.put(11, "kuş");
        lhm.put(4, "kurt");

        System.out.println("lhm = " + lhm);

        Map<Integer, String> tm = new TreeMap<>();
        tm.put(9, "tilki");
        tm.put(2, "kedi");
        tm.put(30, "köpek");
        tm.put(11, "kuş");
        tm.put(4, "kurt");
        System.out.println("tm = " + tm);

    }
}
