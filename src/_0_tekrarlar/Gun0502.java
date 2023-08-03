package _0_tekrarlar;

import java.util.Scanner;

public class Gun0502 {
    public static void main(String[] args) {

        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a    alan =a*a

        Scanner oku=new Scanner(System.in);
        System.out.println("kareninkenaruzunluğu= ");
        int kenar=oku.nextInt();
        int cevre=kenar*4;
        int alan=kenar*kenar;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


    }


}
