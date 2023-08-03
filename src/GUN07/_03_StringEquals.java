package GUN07;

public class _03_StringEquals {
    public static void main(String[] args) {


        //equals: 2 stringin birbirne eşit olup olmadığını kontrol eder
        //sonu boolean

        String s1 = "merhaba";
        String s2 = "MERHABA";

        boolean esitMi = s1.equals(s2);
        System.out.println("esitMi = " + esitMi);


        System.out.println("EsitMi = " + s1.equals(s2));
        System.out.println("EsitMi ="+s1.equals("merhaba"));



    }


}
