package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler = {"Ahmet", "Zeynep", "Roman", "Kaya", "Cihan"};
        //diziyi direkt ekrana yazırımak için
        System.out.println("isimler = " + Arrays.toString(isimler));
        int[]a={1,8,3,54};
        System.out.println("a = " +Arrays.toString(a) );

        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));
        
        
        //diziler eşit mi
        int[]b={1,8,3,54};
        int[]c={1,3,8,54};
        System.out.println("Arrays.equals(b,c) = " + Arrays.equals(b,c));
        //contains gibi çalışır,var ise poizitif sayı verir,yoksa negatif
        System.out.println("Arrays.binarySearch(a,3)"+Arrays.binarySearch(a,3));
        System.out.println("Arrays.binarySearch(c,3)"+Arrays.binarySearch(c,3));
//diziyi hızlıca doldurmak bir değer ile
        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a)= "+Arrays.toString(a));


    }


}
