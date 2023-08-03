package OdevArray;

public class Odev2 {
    public static void main(String[] args) {
//        Bir String oluşturun : "Hello World"
//        Stringi tersten yazdırın ve print edin.
//        _Cevap böyle olmalı :  "dlroW olleH"_

        String cumle = "hello world";
        String tcumle = " ";
        for (int i = cumle.length()-1; i >=0 ; i--) {
            tcumle=tcumle+cumle.charAt(i);

        }
        System.out.println("tstr = " + tcumle);
    }


}








