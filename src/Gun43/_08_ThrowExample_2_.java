package Gun43;

import java.util.Scanner;

public class _08_ThrowExample_2_ {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");


        System.out.print("Yeni şifre= ");
        String newPassowrd = oku.nextLine();
        try {
            if (newPassowrd.length() < 8)
              throw new Exception("şifre en az 8 karekter olmalı");

            if (newPassowrd.length()>15)
                throw new Exception("şifre en fazla 15 karekter olmalı");
        }catch (Exception ex){
            System.out.println("Lüften dikkat!");
            System.out.println(ex.getMessage());




        }


    }


}
