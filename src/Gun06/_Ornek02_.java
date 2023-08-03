package Gun06;

import java.util.Scanner;

public class _Ornek02_ {
    public static void main(String[] args) {

        //kullanıcadan cadde(s),sokak(s),posta kodu(i) ülke(s)
        //adres bilgisinizi yazdırınız
        //ev sahibimisiniz

        Scanner oku=new Scanner(System.in);
        System.out.print("Cadde adı= ");
        String caddeadi= oku.nextLine();
        System.out.print("Sokak adı= ");
        String sokakdi= oku.nextLine();
        System.out.print("Ülke adı =");
        String ulkeadi=oku.nextLine();
        System.out.print("Posta Kodu =");
        int postakodu= oku.nextInt();
        System.out.print("Ev sahibi misin? ");
        boolean Evsahibimisim=oku.nextBoolean();
        System.out.println("cadde adi = " + caddeadi);
        System.out.println("sokak adi = " + sokakdi);
        System.out.println("ulke adi = " + ulkeadi);
        System.out.println("posta kodu = " + postakodu);
        System.out.println("Evsahibi misin = " + Evsahibimisim);







    }




}
