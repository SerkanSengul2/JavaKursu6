package Gun25tekrar.Oppsoru;

import java.util.ArrayList;
import java.util.Scanner;

public class Galary {
    public static void main(String[] args) {
        Scanner okustr = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);

        cars car = new cars();
        for (int i = 0; i < 3; i++) {


            System.out.print("araba numarası giriniz= ");
            car.carNo = okuint.nextInt();
            System.out.print("araba yılını giriniz= ");
            car.year = okuint.nextInt();
            System.out.print("araba modeli giriniz= ");
            car.model = okustr.nextLine();

            car.galary.add(car);

        }
        arabalariyazdir(car.galary);
        uretimyiliortalamasi(car.galary);

    }

    public static void arabalariyazdir(ArrayList<cars> galary) {
        for (cars a : galary)
            //sağdan sola atılır(sağdaki tipten bir indexi sol taraftaki index'e atılır ve yazdırılır.)


            System.out.println("modeli= " + " " + a.model + "numarası= " + " " + a.carNo + " " + "yılı= " + a.year);


    }

    public static void uretimyiliortalamasi(ArrayList<cars> galary) {
        int toplam = 0;
        for (cars b : galary)
            toplam += b.year;

        int ortalama = toplam / galary.size();
        System.out.println("ortalama = " + ortalama);


    }

}

