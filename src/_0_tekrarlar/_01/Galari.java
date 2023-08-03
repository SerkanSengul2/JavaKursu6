package _0_tekrarlar._01;

import Gun25._04soru.Otogaleri;

import java.util.ArrayList;
import java.util.Scanner;

public class Galari {
    public static void main(String[] args) {

        Scanner okustr = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);

        ArrayList<arabalar> NewCars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arabalar car = new arabalar();
            System.out.print("arabanın numarası= ");
            car.arabaNo = okuint.nextInt();
            System.out.print("arabanın markası= ");
            car.marka = okustr.nextLine();
            System.out.print("arabanın uretim yılı= ");
            car.uretimYili = okuint.nextInt();
            NewCars.add(car);
        }

        Arabayazdir(NewCars);
        UretimYilOrtalamasi(NewCars);
    }

    public static void Arabayazdir(ArrayList<arabalar> NewCars) {
        for (arabalar x : NewCars) {
            System.out.println(x.arabaNo + " " + x.uretimYili + " " + x.marka);
        }

    }

    public static void UretimYilOrtalamasi(ArrayList<arabalar>Newcars){
        int toplam=0;
        for (arabalar x:Newcars)
            toplam+= x.uretimYili;
            int ortalama= toplam/Newcars.size();
            System.out.println("ortalama = " + ortalama);


}
}
