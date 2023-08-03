package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        //ilkel tip,pritive tip:short/long/double/boolean/byte
        int sayi1=5;
        int sayi2=12;
        
        sayi1=sayi2;// sayi1=12 oldu//sayi2 nin degerı alındı ve sayı1 e verildi
        sayi1=34;
        sayi2=45;
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi1 = " + sayi1);

        //Refarans tipler:Classlar,diziler,arrayler,nesneler
        //ismi ayrı değeri ayrı tutuluyor.
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("diz2 = " + Arrays.toString(dizi2));
        
        dizi1=dizi2;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//5,6
        System.out.println("diz2 = " + Arrays.toString(dizi2));//5,6

        dizi1[0]=67;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("diz2 = " + Arrays.toString(dizi2));

        dizi2[0]=55;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("diz2 = " + Arrays.toString(dizi2));

        //nesne tipleri: Null alabilen ilkel tip
        //String,double,long,ınteger

        String ad1="mehmet";
        String ad2="ismet";
        
        ad1=ad2;
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad1="ali";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad2="zeynep";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);
        
    }
}
