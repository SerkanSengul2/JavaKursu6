package _0_tekrarlar;

import java.util.Scanner;

public class gun06 {
    public static void main(String[] args) {
        //kullanıcadan cadde(s),sokak(s),posta kodu(i) ülke(s)
        //adres bilgisinizi yazdırınız
        //ev sahibimisiniz

        Scanner oku = new Scanner(System.in);
        System.out.print("cadde adı= ");
        String cd = oku.nextLine();
        System.out.print("sokak adı= ");
        String sk = oku.nextLine();
        System.out.print("ülke adı= ");
        String uk = oku.nextLine();
        System.out.print("posta adı= ");
        int pk = oku.nextInt();
        System.out.print("eviniz var mı? ");
        boolean varMI = oku.nextBoolean();

        System.out.println("adresiniz= "+cd + " " + " " + sk + " " + uk + " " + pk);


    }


}
