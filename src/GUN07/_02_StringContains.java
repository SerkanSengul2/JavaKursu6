package GUN07;

public class _02_StringContains {
    public static void main(String[] args) {

        //contains : bir stringin içersinde karekter(lerin)var olup olmadıgını 
        //boolean cinsinden söyle true veya false
        
        String cumle="merhaba dünya";
        boolean VArMi= cumle.contains("a");
        System.out.println("Varmi b="+cumle.contains("b"));
        System.out.println("Varmi z = " + cumle.contains("z"));
        System.out.println("VArMi ya = " + cumle.contains("ya"));
        


    }


}
