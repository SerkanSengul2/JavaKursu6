package Gun24JavaMap;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMAp {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "serkan şengül");
        hm.put(1002, "ısmet yavuz");
        hm.put(1051, "Kerem dizdar");
        hm.put(1062, "Serkan Özşahin");


        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        for (Integer k : hm.keySet())
            System.out.println(k + "\t");

        for (String v : hm.values())
            System.out.println(v + "\t");

        System.out.println();

        for (Map.Entry<Integer, String> kv : hm.entrySet()) {
            System.out.println(kv.getKey() + "- " + kv.getValue());
        }


    }

}
