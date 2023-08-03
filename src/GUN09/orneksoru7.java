package GUN09;

import java.util.Scanner;

public class orneksoru7 {
    public static void main(String[] args) {
        //girilen bir cümledeki küçük veya büyük a harfini olup olmadıgını
        //var ve yok şeklinde yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("cümle oku= ");
        String cumle = oku.nextLine();
        cumle=cumle.toLowerCase();
        if (cumle.contains("a")) {
            System.out.println("var");
        }
        if (!cumle.contains("a")) {
            System.out.println("yok");
        }







    }


}
