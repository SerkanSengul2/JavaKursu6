package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("RED");
        renkler.add("Red");//tekrar değer eklediği için başasırız.
        System.out.println("renkler = " + renkler);

        for (String eleman : renkler) {//sıra garanti değil
            System.out.println("eleman = " + eleman);
//        }
//        //foreach
//        Integer[]dizi={34,5,6,7,8,89,899,77};
//        for (int eleman:dizi){
//            System.out.println("eleman = " + eleman);
//        }
//        ArrayList<Integer>Liste=new ArrayList<>(Arrays.asList(dizi));
//
//        for (Integer e:Liste);

            Iterator gosterge = renkler.iterator();
            while (gosterge.hasNext())//sırada eleman var ise{
            {
                System.out.println("gosterge = " + gosterge.next());
                //.next gostergesını gosterdıgı elemanı temsıl edıyor.

            }


        }
    }
}

