package Gun25._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Orneksoru {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        Scanner okstr = new Scanner(System.in);

        ArrayList<Student> ogrenciler = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student ogr4 = new Student();
            System.out.print("Ogrencı adi= ");
            ogr4.adi = oku.nextLine();
            System.out.print("Ogrencı soyadı= ");
            ogr4.soyad = oku.nextLine();
            System.out.print("Ogrencı sınıfı= ");
            ogr4.sinifi = okstr.nextInt();
            System.out.print("Ogrencı adresi= ");
            ogr4.adres = oku.nextLine();

            ogrenciler.add(ogr4);

        }

        for (Student o : ogrenciler) {
            System.out.println("o.adi = " + o.adi);
            System.out.println("o.soyad = " + o.soyad);
            System.out.println("o.sinifi = " + o.sinifi);
            System.out.println("o.adres = " + o.adres);
        }

    }


}
    

