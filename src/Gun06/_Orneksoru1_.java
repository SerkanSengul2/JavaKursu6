package Gun06;

import java.util.Scanner;

public class _Orneksoru1_ {
    public static void main(String[] args) {
        //girilen bir stringin sadece son harifini yazdırınız
        //son harf bulmak ıcın uzunluk-1(lenght-1)
        Scanner oku=new Scanner(System.in);
        System.out.print("cümle= ");
        String cumle=oku.nextLine();
        int uzunluk=cumle.length();
        char sonharf=cumle.charAt(uzunluk-1);
        System.out.println("sonharf = " + sonharf);
        




    }



}
