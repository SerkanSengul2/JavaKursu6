package Gun43;

import java.util.Scanner;

public class _07_ThrowExample {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");


        System.out.print("Yeni şifre");
        String newPassowrd= oku.nextLine();

        if (newPassowrd.length()<8){
            System.out.println("lütfen dikkat!");
            System.out.println("şifre en az 8 karekter olmalı");
            //hangi ip bağlandı kayıt edersin
            //yapılacak ortak işler
        }




        if (newPassowrd.length()>15){
            System.out.println("lütfen dikkat!");
            System.out.println("şifre en fazla 15 karekter olmalı");
            //hangi ip bağlandı kayıt edersin
            //yapılacak ortak işler
        }


    }
}
