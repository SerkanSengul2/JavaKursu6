package Gun24JavaMap;

import java.util.HashMap;

public class _01_JavaMAp {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map -> Anahtar + Set -> Anahtarlı Set  (Tekrar eden anahtarlar yok)
        //anahtarın tipi Integer, değerin tipi String

        //anahtarın tipini Integer,değerin tipi String
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1001,"serkan şengül");
        hm.put(1002,"ısmet yavuz");
        hm.put(1051,"Kerem dizdar");
        hm.put(1062,"Serkan Özşahin");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(1001) = " + hm.get(1001));
        System.out.println("hm.get(1062) = " + hm.get(1062));

        System.out.println("hm = " + hm.containsKey(1001));
        System.out.println("hm.containsKey(1062) = " + hm.containsKey(1062));


        System.out.println("hm.keySet() = " + hm.keySet());//keyleri toplu verir
        System.out.println("hm.values() = " + hm.values());//değerleri toplu verir
        
        hm.remove(1001);
        System.out.println("hm = " + hm);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
