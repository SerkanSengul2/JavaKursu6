package GUN07;

public class _06_StringSubstring {
    public static void main(String[] args) {

        //string belli bölümünü alma işlemnini yapar.
        //  0123456901234567     

        String s1 = "Merhaba arkadaşlar";
        String parca1=s1.substring(3,9);//3den 9a kadar al 9 dahil degıl
        System.out.println("parca1 = " + parca1);
        
        String parca2=s1.substring(8,15);
        System.out.println("parca2 = " + parca2);
        String parca3=s1.substring(8);//den sonuna kadar al
        System.out.println("parca3 = " + parca3);



    }


}
