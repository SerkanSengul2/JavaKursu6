package Gun12;

import java.awt.*;
import java.util.Scanner;

public class orneksoru02 {
    public static void main(String[] args) {
        //(int) (Math.random()*10 ---> 0-9
        //20-30 arası random sayı?

        //girilen min ve max aralagında random sayı ureten programı yazınız

        Scanner oku = new Scanner(System.in);
        System.out.print("min(alt sınır)=");
        int min = oku.nextInt();
        System.out.print("max(üst sınır)= ");
        int max = oku.nextInt();

        int rndSayi =(int) (Math.random()*(max-min))+min;
        System.out.println("rndSayi = " + rndSayi);


    }


}
