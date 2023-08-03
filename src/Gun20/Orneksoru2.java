package Gun20;

import Utility.MyFunc;

import java.util.Scanner;

public class Orneksoru2 {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi1 = oku.nextInt();
        System.out.print("sayi giriniz= ");
        int sayi2 = oku.nextInt();
        int enb = enbul(sayi1, sayi2);
        System.out.println("enb = " + enb);

    enb=MyFunc.enBul(sayi1,sayi2);

    }

    public static int enbul(int sayi1, int sayi2) {

        return (sayi1 > sayi2 ? sayi1 : sayi2);
    }



}







