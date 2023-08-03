package Gun05;

import java.awt.*;
import java.util.Scanner;

public class _07_ornek07 {
    public static void main(String[] args) {
        //bir diktörgenın gereklı kenar(int) uzunluklarını kullanıcan ısteyıp
        //alan ve cevresını bulunu
        //cevre=a+b+a+b alan=a*b


        Scanner oku = new Scanner(System.in);
        System.out.print("uzunkenar=");
        int a=oku.nextInt();
        System.out.print("kısa kenar=");
        int b=oku.nextInt();
        System.out.println("cevre="+(a+b+a+b));
        System.out.println("alan"+(a*b));



    }


}
