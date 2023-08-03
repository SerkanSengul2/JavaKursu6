package Gun05;

import java.util.Scanner;

public class _04_ornek04 {
    public static void main(String[] args) {


//kullanıcının adını ve soyadını ayrı ayrı okutup birlikte yazınız

        Scanner okuyucu = new Scanner(System.in);

        System.out.print("Adınızı giriniz=");
        String ad = okuyucu.nextLine();
        System.out.print("Soyadınızı giriniz=");
        String soyad = okuyucu.nextLine();
        System.out.println("ad="+ad);
        System.out.println("soyad="+soyad);
        System.out.println("Adınız ve soyadınız ="+ad+""+soyad);


    }


}
