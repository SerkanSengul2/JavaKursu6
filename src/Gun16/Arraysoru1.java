package Gun16;

import java.util.Scanner;

public class Arraysoru1 {
    public static void main(String[] args) {

        //5 kişik bir sınıfın notlarını gırınız ortalamdan büyük
        //kac not oldugunu bulunuz


        int[] notlar = new int[5];//5 tane int kutusu olusturuldu
        Scanner oku = new Scanner(System.in);
        int gecenler=0;
        int toplam = 0;
        for (int i = 0; i < notlar.length; i++) {
            System.out.print("not giriniz=");
            notlar[i] = oku.nextInt();
            toplam = toplam + notlar[i];

        }

        int ort = toplam / notlar.length;
        for (int i = 0; i <5 ; i++) {
            
        if (notlar[i]>=ort){
            System.out.println(notlar[i]);
            gecenler++;
        }
        
        }
        System.out.println("ort = " + ort);
        System.out.println("gecenler = " + gecenler);
    }

}
    



