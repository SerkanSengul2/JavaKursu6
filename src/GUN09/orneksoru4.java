package GUN09;

import java.util.Scanner;

public class orneksoru4 {
    public static void main(String[] args) {
    //girilen bir sayının tek mi çift olduğunu yazdırınız
    //tek veya çift şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi=oku.nextInt();
        if(sayi%2==1) {
            System.out.println("tek");
        }
        if (sayi%2==0) {
            System.out.println("çift");
        }








    }



}
