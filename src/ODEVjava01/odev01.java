package ODEVjava01;

import java.util.Scanner;

public class odev01 {
    public static void main(String[] args) {
        //Kullanıcıdan 2 kere şifresini isteyiniz, aynı ise TAMAM, değil ise HATALI şifre yazınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("1.şifre= ");
        int s1=oku.nextInt();
        System.out.print("2.şifre= ");
        int s2=oku.nextInt();
        if (s1==s2) {
            System.out.println("tamam");
        }
if (s1!=s2){
    System.out.println("hatalı");
}

 




        }
    }




