package Gun11;

import java.util.Scanner;

public class Orneksoru01 {
    public static void main(String[] args) {

//yan yana aralarında bosluk 2 ınt sayının
//birine esıt olup olmadıgını bulunuz
// 45 67

        Scanner oku = new Scanner(System.in);
        System.out.print("sayıları aralarında bir bosluk olarak giriniz= ");
        String cumle = oku.nextLine();
        int bosluk = cumle.indexOf(" ");
        int s1 = Integer.parseInt(cumle.substring(0, bosluk));
        int s2 = Integer.parseInt(cumle.substring(bosluk + 1));
        if (s1 == s2) {
            System.out.println("doğru");
        } else
            System.out.println("yanlıs");


    }


}
