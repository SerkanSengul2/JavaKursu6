package Gun43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class NesneObject {
    public static void main(String[] args) {
        //her şey bir nesne(Objet) mi
        //kisi ogr=new Student();
        //Object ogr1=new Stundet();

        ArrayList<Object>genelList=new ArrayList<>();
        genelList.add(1);
        genelList.add("ismet");
        genelList.add(3.5);
        genelList.add(true);
        //her tip eklenebiliyor,çünkü bütün tipler Object türetildiği için
        double oran=10/3.0;
        System.out.println("oran = " + oran);

        //        System.out.printf("format ",degisken);
        System.out.printf("%f",oran);//%f : %=degıskenın gelecegı yer
                                     //f: double,float kesilirli olan herşey

        System.out.printf("sonuç= %4.1f\n",oran);
        //4: toplamda 4 hane kullanıcak nokta dahil.
        //1: noktadan sonra kaç hane kullanıcak
        int sayi=5;
        System.out.printf("Sonuc= %-5.4f , TamSAyi=%d",oran, sayi);
        //f: double veya float
        //d: decimal:tam sayi
        //s: string değişkenler
        
    }
}
