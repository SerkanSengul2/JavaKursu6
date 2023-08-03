package GUN09;

import java.util.Scanner;

public class orneksoru3 {
    public static void main(String[] args) {
        //girilen iki sayıdan büyük olanın degerını ekrana yazdırınız
        //esıt ıse esıt yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı1 giriniz=");
        int sayi1 = oku.nextInt();
        System.out.print("sayi2 giriniz");
        int sayi2 = oku.nextInt();

        if (sayi1 < sayi2) {
            System.out.println("sayi 2 büyük yaz");
        }
        if (sayi1 > sayi2) {
            System.out.println("sayi 1 büyük yaz");
        }
        if (sayi1==sayi2){
            System.out.println("eşittir yaz");
        }
}


}
