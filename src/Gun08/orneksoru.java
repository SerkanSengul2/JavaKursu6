package Gun08;

import java.util.Scanner;

public class orneksoru {
    public static void main(String[] args) {

//kullanıcın gırecegı 2 sayının bırbırne esıt mı olup olmadıgnı yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("birinci sayı=");
        int sayi1 = oku.nextInt();
        System.out.print("ikinci sayı=");
        int sayi2= oku.nextInt();
        System.out.println("Eşit mi ="+(sayi1==sayi2));




    }


}
